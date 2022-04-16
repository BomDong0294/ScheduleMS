import java.util.Scanner;

import Schedule.GStudySch;
import Schedule.MeetingSch;
import Schedule.RestSch;
import Schedule.Schedules;
import Schedule.ShoppingSch;
import Schedule.StudySch;

import java.util.*;

public class SchManager {
	Schedules schedule; // 스케줄 객체 선언
	Scanner input; //스캐너 선언
	SchManager(Scanner input) {
		this.input = input;
	}
	ArrayList<Schedules> schedule_list = new ArrayList<Schedules>(); // 스케줄 리스트 선언
	
	public void addSchedule() { // 스케줄 추가
		int kind = 0;
		Schedules schedule;
		while (kind != 1 && kind != 2 && kind != 3 && kind != 4 && kind != 5) {
			System.out.println("1) Meeting");
			System.out.println("2) Shopping");
			System.out.println("3) Studying");
			System.out.println("4) GroupStudying");
			System.out.println("5) Resting");
			System.out.print("Type your schedule category (1~5) : ");
			kind = input.nextInt();
			if (kind == 1) {
				schedule = new MeetingSch();
				schedule.getScheduleKind(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else if (kind == 2) {
				schedule = new ShoppingSch();
				schedule.getScheduleKind(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else if (kind == 3) {
				schedule = new StudySch();
				schedule.getScheduleKind(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else if (kind == 4) {
				schedule = new GStudySch();
				schedule.getScheduleKind(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else if (kind == 5) {
				schedule = new RestSch();
				schedule.getScheduleKind(input);
				schedule_list.add(schedule); // 추가된 메서드를 리스트에 추가
				break;
			} else {
				System.out.print("Type your schedule category (1~5) : ");
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
		System.out.print("Type Your Serial number :");
		int serial = input.nextInt(); // 고유 번호 입력
		boolean flag = false; // 데이터 유무 판별을 위한 boolean형의 변수 선언
		
		for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
			if (schedule_list.get(i).getSerial() == serial) { // 스케줄 리스트의 고유번호가 입력한 고유번호와 일치하면
				
				System.out.print("Date's year? : ");
				int year = input.nextInt(); // 연도 입력
				schedule_list.get(i).setYear(year); // 연도를 기존 메서드에 덧씌움
				
				System.out.print("Date's month? : ");
				int mon = input.nextInt(); // 월 입력
				schedule_list.get(i).setMonth(mon); // 월을 기존 메서드에 덧씌움
				
				System.out.print("Date's day? : ");
				int day = input.nextInt(); // 일 입력
				schedule_list.get(i).setDay(day); // 일을 기존 메서드에 덧씌움
				
				System.out.print("At hour? : ");
				int hour = input.nextInt(); // 시 입력
				schedule_list.get(i).setHour(hour); // 시를 기존 메서드에 덧씌움
				
				System.out.print("At minute? : ");
				int min = input.nextInt(); // 분 입력
				schedule_list.get(i).setMinute(min); // 분을 기존 메서드에 덧씌움
				
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
	
	public void viewOneSchedule() { // 특정 스케줄만 출력
		System.out.print("Type Your Serial number : ");
		int serial = input.nextInt(); // 고유번호 입력
		boolean flag = false;// 데이터 유무 판별을 위한 boolean형의 변수 선언
		
		for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
			if (schedule_list.get(i).getSerial() == serial) { // 스케줄 리스트의 고유번호가 입력한 고유번호와 일치하면
				int year = schedule_list.get(i).getYear();
				int mon = schedule_list.get(i).getMonth();
				int day = schedule_list.get(i).getDay();
				System.out.printf("Your Schedule is %d/%02d/%02d",year,mon,day);
				int hour = schedule_list.get(i).getHour();
				int min = schedule_list.get(i).getMinute();
				System.out.printf(" %02d:%02d\n", hour, min); // 스케줄 출력
				
				flag = true; // 데이터가 있으니 조건문 탈출을 위한 전환
				break;
			}
		}
		if (flag==false) { // 데이터가 없으면 여기로 와서 메뉴로 돌아감
			System.out.println("The schedule isn't on the datbase.");
		}
		System.out.println("------------------------------------------------------");
	}
	
	public void viewAllSchedules() { // 모든 스케줄 출력
		if (schedule_list.size() == 0) { // 리스트에 아무것도 없으면
			System.out.println("The schedules aren't on the datbase."); // 메뉴로 돌아감
		} else { // 리스트에 하나라도 정보가 있으면
			for (int i=0; i<schedule_list.size();i++) { // 스케줄 리스트의 크기만큼 반복
				int year = schedule_list.get(i).getYear();
				int mon = schedule_list.get(i).getMonth();
				int day = schedule_list.get(i).getDay();
				System.out.printf("Your Schedule is %d/%02d/%02d",year,mon,day);
				int hour = schedule_list.get(i).getHour();
				int min = schedule_list.get(i).getMinute();
				System.out.printf(" %02d:%02d\n", hour, min); // 스케줄 출력
				System.out.printf("there are %d schedules in database.", schedule_list.size());
			}
		}
		System.out.println("------------------------------------------------------");
	}
	
	public void viewMenu() {
		System.out.println("1. Add Schedule"); // 스케줄 추가 표시
		System.out.println("2. Delete Schedule"); // 스케줄 삭제 표시
		System.out.println("3. Edit Schedule"); // 스케줄 편집 표시
		System.out.println("4. View One Schedule"); // 특정 스케줄 표시
		System.out.println("5. View All Schedule"); // 전체 스케줄 표시
		System.out.println("6. Exit"); // 종료 표시
		System.out.print("Select one number between 1 to 6 : "); //입력하라고 표시
		
	}
}
