package function;
import java.io.Serializable;
import java.util.*;
import data.*;

public class ScheduleFunction implements Serializable{
	// 직렬화 인터페이스를 상속받음.
	private static final long serialVersionUID = 5558847185368508745L;
	// 직렬화를 시킴.
	public ArrayList<InputInterface> schedule_list = new ArrayList<InputInterface>(); // 스케줄 리스트 선언
	
	public void copyFrom(ScheduleFunction other) {
		schedule_list = other.schedule_list;
	}
	
	public void addSchedule(Scanner input) { // 스케줄 추가 메서드
		InputInterface scheduleInput; // 스케줄 객체 선언
		int kind = 0;
		while (kind < 1 || kind > 4) {
			try {
				System.out.println("What do you want to add?");
				System.out.println("1) Meeting");
				System.out.println("2) Shopping");
				System.out.println("3) Studying");
				System.out.println("4) Resting");
				System.out.print("Type your schedule category (1~4) : ");
				kind = input.nextInt(); // 스케줄 카테고리 입력 (단, 1~4가 아니면 반복)
				System.out.println("------------------------------------------------------");
				if (kind == 1) {
					scheduleInput = new Meeting(Kind.Meeting); 
					scheduleInput.getScheduleInput(input);
					schedule_list.add(scheduleInput); // 추가된 메서드를 리스트에 추가
					break;
				} else if (kind == 2) {
					scheduleInput = new Shopping(Kind.Shopping);
					scheduleInput.getScheduleInput(input);
					schedule_list.add(scheduleInput); // 추가된 메서드를 리스트에 추가
					break;
				} else if (kind == 3) {
					scheduleInput = new Study(Kind.Studying);
					scheduleInput.getScheduleInput(input);
					schedule_list.add(scheduleInput); // 추가된 메서드를 리스트에 추가
					break;
				} else if (kind == 4) {
					scheduleInput = new Rest(Kind.Resting);
					scheduleInput.getScheduleInput(input);
					schedule_list.add(scheduleInput); // 추가된 메서드를 리스트에 추가
					break;
				} else {
				}
			} catch(InputMismatchException e) {
				// 만약 kind에 문자가 들어가면 예외처리를 시행함
				System.out.println("Please put an correct integer");
				// 올바른 int형 숫자 입력 요청
				if (input.hasNext()) {
					input.next();
				}
				kind = 0;
				System.out.println("-------------------------Retype-----------------------");
			}
		}
		System.out.println("The information is collected.");
		System.out.println("------------------------------------------------------");
	}
	
	public void deleteSchedule(Scanner input) { // 스케줄 삭제
		System.out.print("Type your schedule serial number : ");
		int serial = input.nextInt(); // 고유 번호 입력
		int index = findIndex(serial);
		removefromSchedules(index, serial);
		System.out.println("------------------------------------------------------");
		
	}
	
	public int findIndex(int serial) {
		int index = -1; // 데이터 유무 판별을 위한 boolean형의 변수 선언
		for (int i=0; i<schedule_list.size();i++) { // 스케줄리스트의 크기만큼 반복
			if (schedule_list.get(i).getSerial() == serial) { // 스케줄 리스트의 고유번호가 입력한 고유번호와 일치하면
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromSchedules(int index, int serial) {
		if (index < 0) { // 데이터가 없으면 여기로 와서 메뉴로 돌아감
			System.out.println("The schedule isn't on the datbase.");
			return -1;
		} else {
			schedule_list.remove(index);
			System.out.println("The data is deleted.");
			return 1;
		}
	}
	
	public void editSchedule(Scanner input) { // 스케줄 편집
		System.out.print("Type Your Serial number : ");
		int serial = input.nextInt(); // 고유 번호 입력
		int index = -1;
		for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
			InputInterface scheduleInput = schedule_list.get(i);
			if (scheduleInput.getSerial() == serial) { // 스케줄 리스트의 고유번호가 입력한 고유번호와 일치하면
				index = i;
				schedule_list.get(i).getScheduleInput(input);
				System.out.println("The information is changed.");
				break;
			}
		}
		if (index < 0) { // 데이터가 없으면 여기로 와서 메뉴로 돌아감
			System.out.println("The schedule isn't on the datbase.");
		}
		System.out.println("------------------------------------------------------");
	}
	
	public void viewOneSchedule(Scanner input) { // 특정 스케줄 출력 메서드
		System.out.print("Type Your Serial number : ");
		int serial = input.nextInt(); // 고유번호 입력
		boolean flag = false;// 데이터 유무 판별을 위한 boolean형의 변수 선언
		
		for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
			if (schedule_list.get(i).getSerial() == serial) {
				// 스케줄 리스트의 고유번호가 입력한 고유번호와 일치하면
				schedule_list.get(i).printInfo(); // 스케줄 출력
				flag = true; // 데이터가 있으니 조건문 탈출을 위한 전환
				break;
			}
		}
		if (flag==false) { // 데이터가 없으면 여기로 와서 메뉴로 돌아감
			System.out.println("The schedule isn't on the datbase.");
		}
		System.out.println("------------------------------------------------------");
	}
	
	public void viewAllSchedules() { // 모든 스케줄 출력 메서드
		if (schedule_list.size() == 0) { // 리스트에 아무것도 없으면
			System.out.println("The schedules aren't on the datbase."); // 정보 없음 표시 후 메뉴로 돌아감
		} else if (schedule_list.size() == 1) { // 리스트에 하나라도 정보가 있으면
			for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
				schedule_list.get(i).printInfo(); // 리스트 내의 정보를 각자 자식 클래스의 출력 메서드에서 출력
				System.out.println(""); // 줄 띄우기
			}
			System.out.printf("there is %d schedule in database.\n", schedule_list.size());
		} else { // 리스트에 하나라도 정보가 있으면
			for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
				schedule_list.get(i).printInfo(); // 리스트 내의 정보를 각자 자식 클래스의 출력 메서드에서 출력
				System.out.println("");
			}
			System.out.printf("there are %d schedules in database.\n", schedule_list.size());
			// 몇 개 있는지 출력
		}
		System.out.println("------------------------------------------------------");
	}
	
	public InputInterface get(int index) {
		return (Schedule) schedule_list.get(index);
	}
	
	public int size() {
		return schedule_list.size();
	}
	
	public static ScheduleFunction getInstance() {
		if (_s_instance == null) {
			_s_instance = new ScheduleFunction();
		}
		return _s_instance;
	}
	
	private static ScheduleFunction _s_instance = null;
}