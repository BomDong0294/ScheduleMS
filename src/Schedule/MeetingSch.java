package Schedule;

import java.util.Scanner;

public class MeetingSch extends Schedules {
	public MeetingSch() {}
	public void getScheduleKind(Scanner input) {
		
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
			System.out.print("Is this meeting regular meeting? (Y/N) : ");
			res = input.next().charAt(0);
			if (res == 'y' || res == 'Y') {
				System.out.println("You have another meeting at 7days later.");
				break;
			} else if (res == 'n' || res == 'N') {
				System.out.println("There isn't another meeting soon.");
				break;
			} else {
			}
		}
	}
}
