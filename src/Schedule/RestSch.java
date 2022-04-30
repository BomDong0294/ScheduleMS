package Schedule;

import java.util.Scanner;

public class RestSch extends Schedules { // 일반 스케줄 클래스를 상속받음
	
	public RestSch(ScheduleKind kind) {
		this.kind = kind;
	}
	
	public void getScheduleInput(Scanner input) { // resting에 맞는 스케줄 입력 메서드 선언
		
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
			res = input.next().charAt(0); // 숙박일이 2일 이상이면?
			if (res == 'y' || res == 'Y') {
				System.out.print("How much you sleep at there? : ");
				int setday = input.nextInt();
				this.setDay(setday); // 숙박하는 기간 저장 (일 단위)
				System.out.println("How many people participate in travel? : ");
				int peoplecount = input.nextInt();
				this.setPeoplecount(peoplecount); // 참석 인원 변수 입력 및 저장
				break;
			} else if (res == 'n' || res == 'N') {
				System.out.println("How many people participate in travel? : ");
				int peoplecount = input.nextInt();
				this.setPeoplecount(peoplecount); // 참석 인원 변수 입력 및 저장
				this.setDay(1); // 당일치기이므로 1일만 저장
				break;
			} else {
			}
		}
		this.setSchhour(-1); // printmoreInfo 메서드의 조건구별을 위한 예정시간 초기화
		this.setMoney(-1); // printmoreInfo 메서드의 조건구별을 위한 돈 초기화
	}
}
