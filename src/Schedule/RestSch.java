package Schedule;

import java.util.Scanner;

public class RestSch extends Schedules {
	
	public RestSch(ScheduleKind kind) {
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
			System.out.print("Will you sleep two days or more? (Y/N) : ");
			res = input.next().charAt(0);
			if (res == 'y' || res == 'Y') {
				System.out.print("How much you sleep at there? : ");
				int setday = input.nextInt();
				this.setDay(setday);
				System.out.println("How many people participate in travel? : ");
				int peoplecount = input.nextInt();
				this.setPeoplecount(peoplecount);
				break;
			} else if (res == 'n' || res == 'N') {
				System.out.println("How many people participate in travel? : ");
				int peoplecount = input.nextInt();
				this.setPeoplecount(peoplecount);
				System.out.println("Check your schedule once again.");
				this.setDay(1);
				break;
			} else {
			}
		}
		this.setSchhour(-1);
		this.setMoney(-1);
	}
}
