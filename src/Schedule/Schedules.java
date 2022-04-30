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
	protected int peoplecount; // meeting, group studying
	protected int money; // shopping, resting
	protected int schhour; // Studying
	protected int schday; // resting
	
	public Schedules() {}
	
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
		return snum; // 고유번호 반환 메서드 추가
	}
	
	public void setSerial(int snum) {
		this.snum = snum; // 고유번호 지칭 메서드 추가
	}
	
	public int getYear() {
		return year; // 연도 반환 메서드 추가
	}
	
	public void setYear(int year) {
		this.year = year; // 연도 지칭 메서드 추가
	}
	
	public int getMonth() {
		return mon; // 월 반환 메서드 추가
	}
	
	public void setMonth(int mon) {
		this.mon = mon; // 월 지칭 메서드 추가
	}
	
	public int getDay() {
		return day; // 일 반환 메서드 추가
	}
	
	public void setDay(int day) {
		this.day = day; // 일 지칭 메서드 추가
	}
	
	public int getHour() {
		return hour; // 시 반환 메서드 추가
	}
	
	public void setHour(int hour) {
		this.hour = hour; // 시 지칭 메서드 추가
	}
	
	public int getMinute() {
		return min; // 분 반환 메서드 추가
	}
	
	public void setMinute(int min) {
		this.min = min; // 분 지칭 메서드 추가
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
	} // 스케줄 생성자 추가
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
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
	
	public void printmoreInfo() {
		if (this.money == -1 && this.schday == -1) {
			System.out.printf("%d people participate the meeting.\n", peoplecount);
			System.out.printf("%dhour meeting will be held.\n", schhour);
		}
		if (this.schday == -1 && this.schhour == -1) {
			System.out.printf("You have %d won. (KRW)\n", money);
			System.out.printf("%d people participate the shopping.\n", peoplecount);
		}
		if (this.schday == -1 && this.money == -2) {
			System.out.printf("%d people participate the studying.\n", peoplecount);
			System.out.printf("%dhour meeting will be held.\n", schhour);
		}
		if (this.schhour == -1 && this.schhour == -1) {
			System.out.printf("%d people participate the resting.\n", peoplecount);
			System.out.printf("%d day planned.\n",schday);
		}
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
	}
}
