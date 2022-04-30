package Schedule;

import java.util.Scanner;

public class ShoppingSch extends Schedules { // 일반 스케줄 클래스를 상속받음
	
	public ShoppingSch(ScheduleKind kind) {
		this.kind = kind;
	}
	
	public void getScheduleInput(Scanner input) { // shopping에 맞는 스케줄 입력 메서드 선언
			
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
			System.out.print("Does some people participates? : (Y/N) : ");
			res = input.next().charAt(0); // 만약 혼자 쇼핑을 하지 않는다면?
			if (res == 'y' || res == 'Y') {
				System.out.print("How many people go shopping with you? : ");
				int peoplecount = input.nextInt();
				this.setPeoplecount(peoplecount+1); // 추가된 인원에 자신을 추가한 값을 저장함
				System.out.print("How much money do you have? : ");
				int money = input.nextInt();
				this.setMoney(money); // 돈 변수 초기화
				break;
			} else if (res == 'n' || res == 'N') {
				this.setPeoplecount(1); // 혼자만 가므로 1을 저장
				System.out.print("How much money do you have? : ");
				int money = input.nextInt();
				this.setMoney(money); // 돈 변수 초기화
				break;
			} else {
			}
		}
		this.setSchday(-1); // printmoreInfo 메서드의 조건구별을 위한 예정일 변수 초기화
		this.setSchhour(-1); // printmoreInfo 메서드의 조건구별을 위한 예정 시간 변수 초기화
	}
}
// .