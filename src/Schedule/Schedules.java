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
	
	public Schedules() {}
	
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
	
	
	public Schedules(int snum, int year, int mon, int day, int hour, int min) {
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
	} // 스케줄 메서드 추가
	
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
	}
	
}
