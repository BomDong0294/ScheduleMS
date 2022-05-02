package Schedule;

import java.util.Scanner;

public class Schedules {
	protected ScheduleKind kind = ScheduleKind.Meeting;
	protected int year; // 연도 변수 선언
	protected int mon; // 월 변수 선언
	protected int day; // 일 변수 선언
	protected int snum; // 고유번호 변수 선언
	protected int hour; // 시 변수 선언
	protected int min; // 분 변수 선언
	protected int peoplecount; // meeting, group studying에서 사용되는 변수
	protected int money; // shopping, resting에서 사용되는 변수
	protected int schhour; // Studying에서 사용되는 변수
	protected int schday; // resting에서 사용되는 변수
	
	public Schedules() {}
	
	// 여기서부터 112번째 줄까지 있는 변수들을 getter, setter메서드 구현한 것
	
	public Schedules(ScheduleKind kind) {
		this.kind = kind;
	}
	
	public ScheduleKind getKind() {
		return kind;
	}
	
	public void setKind(ScheduleKind kind) {
		this.kind = kind;
	}
	
	public int getSerial() {
		return snum;
	}
	
	public void setSerial(int snum) {
		this.snum = snum;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year; 
	}
	
	public int getMonth() {
		return mon;
	}
	
	public void setMonth(int mon) {
		this.mon = mon; 
	}
	
	public int getDay() {
		return day; 
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getMinute() {
		return min;
	}
	
	public void setMinute(int min) {
		this.min = min;
	}
	
	public int getPeoplecount() {
		return peoplecount;
	}

	public void setPeoplecount(int peoplecount) {
		this.peoplecount = peoplecount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getSchhour() {
		return schhour;
	}

	public void setSchhour(int schhour) {
		this.schhour = schhour;
	}

	public int getSchday() {
		return schday;
	}

	public void setSchday(int schday) {
		this.schday = schday;
	}
	
	public Schedules(ScheduleKind kind, int snum, int year, int mon, int day, int hour, int min) {
		this.kind = kind;
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
	} // 기본형 스케줄 생성자 추가 단, 이 프로젝트에서는 당장 사용하지 않음.
	
	public Schedules(ScheduleKind kind, int snum, int year, int mon, int day, int hour, int min, int peoplecount, int money, int schhour, int schday) {
		this.kind = kind;
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
		this.peoplecount = peoplecount;
		this.money = money;
		this.schhour = schhour;
		this.schday = schday;
	} // 모든 변수가 다 있는 스케줄 생성자 추가 (완전형 생성자)
	
	public void printInfo() { // 정보를 출력하는 메서드
		String skind = "none"; //kind 변수 초기화
		switch(this.kind) { // enum에 따라 kind변수를 초기화하는 메서드
		case Meeting:
			skind = "Meeting";
			break;
		case Shopping:
			skind = "shopping";
			break;
		case Studying:
			skind = "Studying";
			break;
		case Resting:
			skind = "Resting";
			break;
		default:
		}
		System.out.printf("Your %s is %d/%02d/%02d",skind,year,mon,day);
		System.out.printf(" %02d:%02d\n", hour, min);
	}
	
	public void printmoreInfo() { // 각 자식 클래스의 조건에 따라 부가적인 정보를 출력하는 메서드
		if (this.money == -1 && this.schday == -1) {
			System.out.printf("%d people participate the meeting.\n", peoplecount);
			System.out.printf("%dhour meeting will be held.\n", schhour);
		} // 만약 위 조건이 성립하면 meeting에 해당되는 객체의 부가적인 정보 출력
		if (this.schday == -1 && this.schhour == -1) {
			System.out.printf("You have %d won. (KRW)\n", money);
			System.out.printf("%d people participate the shopping.\n", peoplecount);
		} // 만약 위 조건이 성립하면 shopping에 해당되는 객체의 부가적인 정보 출력
		if (this.schday == -1 && this.money == -2) {
			System.out.printf("%d people participate the studying.\n", peoplecount);
			System.out.printf("%dhour studying will be held.\n", schhour);
		} // 만약 위 조건이 성립하면 studying에 해당되는 객체의 부가적인 정보 출력
		if (this.schhour == -1 && this.schhour == -1) {
			System.out.printf("%d people participate the resting.\n", peoplecount);
			System.out.printf("%d day planned.\n",schday);
		} // 만약 위 조건이 성립하면 resting에 해당되는 객체의 부가적인 정보 출력
	}
	
	public void getScheduleInput(Scanner input) { // 기본형 스케줄 입력 메서드 선언
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
	}
}