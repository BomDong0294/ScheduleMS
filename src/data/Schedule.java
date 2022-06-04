package data;
import java.io.Serializable;
import java.util.Scanner;

import Exceptions.Exceptions;

public abstract class Schedule implements InputInterface, Serializable {
	// 직렬화 인터페이스를 상속받음
	private static final long serialVersionUID = 8101442141971410181L;
	// 직렬화를 하였음.
	protected Kind kind = Kind.Meeting;
	protected int year; // 연도 변수 선언
	protected int mon; // 월 변수 선언
	protected int day; // 일 변수 선언
	protected int snum; // 고유번호 변수 선언
	protected int hour; // 시 변수 선언
	protected int min; // 분 변수 선언
	protected int peoplecount; // 참여 인원 변수 선언
	
	public abstract void printInfo();
	// printInfo() 메서드는 추상화로 선언하여 나머지 자식 클래스에서 사용함
	
	// 여기서부터 마지막 줄까지 있는 변수들을 getter, setter메서드로 구현한 것
	public Schedule(Kind kind) {
		this.kind = kind;
	}
	
	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public void setSerial(int snum) throws Exceptions {
		if (snum < 1) {
			throw new Exceptions();
		}
		this.snum = snum;
	}

	public void setYear(int year) throws Exceptions {
		if (year < 2022) {
			throw new Exceptions();
		}
		this.year = year; 
	}

	public void setMonth(int mon) throws Exceptions {
		if (mon < 1 || mon > 12) {
			throw new Exceptions();
		}
		this.mon = mon; 
	}

	public void setDay(int day) throws Exceptions {
		if (day < 1 || day > 31) {
			throw new Exceptions();
		}
		this.day = day;
	}

	public void setHour(int hour) throws Exceptions {
		if (hour < 0 || hour > 23) {
			throw new Exceptions();
		}
		this.hour = hour;
	}

	public void setMinute(int min) throws Exceptions {
		if (min < 0 || min > 59) {
			throw new Exceptions();
		}
		this.min = min;
	}
	
	public void setPeoplecount(int peoplecount) {
		this.peoplecount = peoplecount;
	}
	
	public void setSerial(Scanner input) {
		int snum = -10;
		while (snum < 1) {
			System.out.print("Type your schedule serial number : ");
			snum = input.nextInt(); // 고유번호 입력
			try {
				this.setSerial(snum);
			} catch (Exceptions e) {
				System.out.println("Please type positive integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public void setYear(Scanner input) {
		int year = 0;
		while (year < 2022) {
			System.out.print("Date's year? : ");
			year = input.nextInt(); // 연도 입력
			try {
				this.setYear(year);
			} catch (Exceptions e) {
				System.out.println("Please type correct integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public void setMonth(Scanner input) {
		int mon = -10;
		while (mon < 1 || mon > 12) {
			System.out.print("Date's month? : ");
			mon = input.nextInt(); // 월 입력
			try {
				this.setMonth(mon);
			} catch (Exceptions e) {
				System.out.println("Please type correct integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public void setDay(Scanner input) {
		int day = 0;
		while (day < 1 || day > 31) {
			System.out.print("Date's day? : ");
			day = input.nextInt(); // 일 입력
			try {
				this.setDay(day);
			} catch (Exceptions e) {
				System.out.println("Please type correct integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}

	public void setHour(Scanner input) {
		int hour = 24;
		while (hour < 0 || hour > 23) {
			System.out.print("At hour? : ");
			hour = input.nextInt(); // 시 입력
			try {
				this.setHour(hour);
			} catch (Exceptions e) {
				System.out.println("Please type correct integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public void setMinute(Scanner input) {
		int min = 60;
		while (min < 0 || min > 59) {
			System.out.print("At minute? : ");
			min = input.nextInt(); // 분 입력
			try {
				this.setMinute(min);
			} catch (Exceptions e) {
				System.out.println("Please type correct integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Meeting:
			skind = "Meeting";
			break;
		case Shopping:
			skind = "Shopping";
			break;
		case Studying:
			skind = "Studying";
			break;
		case Resting:
			skind = "Resting";
			break;
		default:
		}
		return skind;
	}
}