package Schedule;

import java.util.Scanner;

public class StudySch extends Schedules {
	
	public StudySch(ScheduleKind kind) {
		this.kind = kind;
	}
	
	public void getScheduleInput(Scanner input) {
		
		System.out.print("Type your schedule serial number : ");
		int snum = input.nextInt(); // 고유번호 입력
		this.setSerial(snum);
		
		System.out.print("Date's year? : ");
		int year = input.nextInt(); // 연도 입력
		this.setYear(year);
		
		System.out.print("Date's month? : ");
		int mon = input.nextInt(); // 월 입력
		this.setMonth(mon);
		
		System.out.print("Date's day? : ");
		int day = input.nextInt(); // 일 입력
		this.setDay(day);
		
		System.out.print("At hour? : ");
		int hour = input.nextInt(); // 시 입력
		this.setHour(hour);
		
		System.out.print("At minute? : ");
		int min = input.nextInt(); // 분 입력
		this.setMinute(min);
		
		char res = 'a';
		while (res != 'y' && res != 'Y' && res != 'n' && res != 'N') {
			System.out.print("Is it a group project? (Y/N) : ");
			res = input.next().charAt(0);
			if (res == 'y' || res == 'Y') {
				System.out.print("How many people participate in the project? : ");
				int peoplecount = input.nextInt();
				this.setPeoplecount(peoplecount+1);
				System.out.print("How much time you scheduled?");
				int schhour = input.nextInt();
				this.setSchhour(schhour);
				break;
			} else if (res == 'n' || res == 'N') {
				System.out.print("How much time you scheduled?");
				int schhour = input.nextInt();
				this.setSchhour(schhour);
				this.setPeoplecount(1);
			} else {
			}
		}
		this.setSchday(-1);
		this.setMoney(-2);
	}
}
