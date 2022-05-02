import java.util.Scanner;

import Schedule.MeetingSch; // 미팅 일정 클래스 임포트
import Schedule.RestSch; // 휴식 일정 클래스 임포트
import Schedule.ScheduleKind;
import Schedule.Schedules; // 기본 스케줄 클래스 임포트
import Schedule.ShoppingSch; // 쇼핑 일정 클래스 임포트
import Schedule.StudySch; // 공부 일정 클래스 임포트
import java.util.*;

public class SchManager {
	 
	Scanner input; //스캐너 선언
	SchManager(Scanner input) {
		this.input = input;
	}
	ArrayList<Schedules> schedule_list = new ArrayList<Schedules>(); // 스케줄 리스트 선언
	
	public void addSchedule() { // 스케줄 추가 메서드
		Schedules schedule; // 스케줄 객체 선언
		int kind = 0;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4) {
			System.out.println("1) Meeting");
			System.out.println("2) Shopping");
			System.out.println("3) Studying");
			System.out.println("4) Resting");
			System.out.print("Type your schedule category (1~4) : ");
			kind = input.nextInt(); // 스케줄 카테고리 입력 (단, 1~4가 아니면 반복)
			System.out.println("------------------------------------------------------");
			if (kind == 1) {
				schedule = new MeetingSch(ScheduleKind.Meeting); 
				schedule.getScheduleInput(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else if (kind == 2) {
				schedule = new ShoppingSch(ScheduleKind.Shopping);
				schedule.getScheduleInput(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else if (kind == 3) {
				schedule = new StudySch(ScheduleKind.Studying);
				schedule.getScheduleInput(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else if (kind == 4) {
				schedule = new RestSch(ScheduleKind.Resting);
				schedule.getScheduleInput(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else {
				System.out.print("Type your schedule category (1~4) : ");
			}
		}
		System.out.println("The information is collected.");
		System.out.println("------------------------------------------------------");
	}
	
	public void deleteSchedule() { // 스케줄 삭제
		System.out.print("Type your schedule serial number : ");
		int serial = input.nextInt(); // 고유 번호 입력
		boolean flag = false; // 데이터 유무 판별을 위한 boolean형의 변수 선언
		for (int i=0; i<schedule_list.size();i++) { // 스케줄리스트의 크기만큼 반복
			if (schedule_list.get(i).getSerial() == serial) { // 스케줄 리스트의 고유번호가 입력한 고유번호와 일치하면
				schedule_list.remove(i); // 스케줄 리스트의 해당 메서드를 삭제
				System.out.println("The data is deleted.");
				flag = true; // 데이터가 있으니 조건문 탈출을 위한 전환
				break;
			}
		}
		if (flag==false) { // 데이터가 없으면 여기로 와서 메뉴로 돌아감
			System.out.println("The schedule isn't on the datbase.");
		}
		System.out.println("------------------------------------------------------");
	}
	
	public void editSchedule() { // 스케줄 편집
		System.out.print("Type Your Serial number : ");
		int serial = input.nextInt(); // 고유 번호 입력
		boolean flag = false; // 데이터 유무 판별을 위한 boolean형의 변수 선언
		
		for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
			if (schedule_list.get(i).getSerial() == serial) { // 스케줄 리스트의 고유번호가 입력한 고유번호와 일치하면
				schedule_list.get(i).getScheduleInput(input);
				System.out.println("The information is changed.");
				flag = true; // 데이터가 있으니 조건문 탈출을 위한 전환
				break;
			}
		}
		if (flag==false) { // 데이터가 없으면 여기로 와서 메뉴로 돌아감
			System.out.println("The schedule isn't on the datbase.");
		}
		System.out.println("------------------------------------------------------");
	}
	
	public void viewOneSchedule() { // 특정 스케줄 및 세부 정보 출력 메서드
		System.out.print("Type Your Serial number : ");
		int serial = input.nextInt(); // 고유번호 입력
		boolean flag = false;// 데이터 유무 판별을 위한 boolean형의 변수 선언
		
		for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
			if (schedule_list.get(i).getSerial() == serial) {
				// 스케줄 리스트의 고유번호가 입력한 고유번호와 일치하면
				schedule_list.get(i).printInfo(); // 스케줄 출력
				schedule_list.get(i).printmoreInfo(); // 자식 클래스의 추가 정보 출력
				flag = true; // 데이터가 있으니 조건문 탈출을 위한 전환
				break;
			}
		}
		if (flag==false) { // 데이터가 없으면 여기로 와서 메뉴로 돌아감
			System.out.println("The schedule isn't on the datbase.");
		}
		System.out.println("------------------------------------------------------");
	}
	
	public void viewAllSchedules() { // 모든 스케줄 출력 메서드 (단, 세부 정보는 4번 키워드에서만 실행)
		if (schedule_list.size() == 0) { // 리스트에 아무것도 없으면
			System.out.println("The schedules aren't on the datbase."); // 메뉴로 돌아감
		} else { // 리스트에 하나라도 정보가 있으면
			for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
				schedule_list.get(i).printInfo();
				System.out.printf("there are %d schedules in database.\n", schedule_list.size());
			}
		}
		System.out.println("If you want view more detail, type keyword 4 (View One Schedule).");
		System.out.println("------------------------------------------------------");
	}
	
	public void viewMenu() { // 메뉴 출력 메서드
		System.out.println("1. Add Schedule"); // 스케줄 추가 표시
		System.out.println("2. Delete Schedule"); // 스케줄 삭제 표시
		System.out.println("3. Edit Schedule"); // 스케줄 편집 표시
		System.out.println("4. View One Schedule"); // 특정 스케줄 표시
		System.out.println("5. View All Schedule"); // 전체 스케줄 표시
		System.out.println("6. Exit"); // 종료 표시
		System.out.print("Select one number between 1 to 6 : "); //입력하라고 표시
	}
}