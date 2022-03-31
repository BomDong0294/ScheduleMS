import java.util.Scanner;

public class SchManager {
	Schedules schedule;
	Scanner input;
	SchManager(Scanner input) {
		this.input = input;
	}
	
	public void addSchedule() {
		schedule = new Schedules();
		System.out.print("Type your schedule category (ex : Meeting) : ");
		schedule.sch = input.next(); // 스케줄 추가
		System.out.print("Type your schedule serial number : ");
		schedule.serial = input.nextInt();
		System.out.print("Date's year? : ");
		schedule.year = input.nextInt(); // 연도 추가
		System.out.print("Date's month? : ");
		schedule.mon = input.nextInt(); // 달 추가 
		System.out.print("Date's day? : ");
		schedule.day = input.nextInt(); // 일 추가
		System.out.print("At hour? : ");
		schedule.hour = input.nextInt(); // 시간 추가
		System.out.print("At minute? : ");
		schedule.min = input.nextInt(); // 분 추가
		System.out.println("The information is collected.");
		System.out.println("------------------------------------------------------");
	}
	
	public void deleteSchedule() {
		System.out.print("Type your schedule serial number : ");
		int serial = input.nextInt(); // 스케줄 삭제
		if (schedule == null) {
			System.out.println("The schedule isn't been registered.");
			return;
		}
		if (schedule.serial == serial) {
			schedule = null;
			System.out.println("The data is deleted.");
		}
		System.out.println("------------------------------------------------------");
		
	}
	
	public void editSchedule() {
		System.out.print("Type Your Serial number :");
		int serial = input.nextInt();
		if (schedule.serial != serial) {
			System.out.println("The schedule isn't on the datbase.");
			System.out.println("------------------------------------------------------");
			return;
		}
		System.out.print("Type your schedule category (ex : Meeting) : ");
		schedule.sch = input.next();
		System.out.print("Date's year? : ");
		schedule.year = input.nextInt();
		System.out.print("Date's month? : ");
		schedule.mon = input.nextInt();
		System.out.print("Date's day? : ");
		schedule.day = input.nextInt();
		System.out.print("At hour? : ");
		schedule.hour = input.nextInt(); 
		System.out.print("At minute? : ");
		schedule.min = input.nextInt(); // 데이터 편집
		System.out.println("The information is collected.");
		System.out.println("------------------------------------------------------");
	}
	
	public void viewSchedule() {
		System.out.print("Type your schedule serial number : ");
		int serial = input.nextInt();
		if (schedule.serial != serial) {
			System.out.println("The schedule isn't on the datbase.");
			System.out.println("------------------------------------------------------");
			return;
		}
		if (schedule.serial == serial) {
			schedule.printSch();
		}
		System.out.println("------------------------------------------------------"); // 데이터 표기
	}
	
}
