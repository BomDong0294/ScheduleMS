package data;
import java.io.Serializable;
import java.util.Scanner;

import Exceptions.Exceptions;

public abstract class Schedule implements InputInterface, Serializable {
	// 직렬화 인터페이스를 상속받음
	private static final long serialVersionUID = 8101442141971410181L;
	// 직렬화를 하였음.
	protected Kind kind = Kind.Meeting;
	protected int snum; // 고유번호 변수 선언
	protected int year; // 연도 변수 선언
	protected int mon; // 월 변수 선언
	protected int day; // 일 변수 선언
	protected int hour; // 시 변수 선언
	protected int min; // 분 변수 선언
	protected int peoplecount;
	protected int schhour; // 일정 시간 변수 선언
	protected int money; // 돈 변수 선언
	protected int schday; // 예정 휴식기간 변수 추가
	
	public abstract void printInfo();
	// printInfo() 메서드는 추상화로 선언하여 나머지 자식 클래스에서 사용함
	
	// 여기서부터 마지막 줄까지 있는 변수들을 getter, setter메서드로 구현한 것
	public Schedule(Kind kind) {
		this.kind = kind;
	}

	public Schedule(Kind kind, int snum, int year, int mon, int day, int hour, int min, int peoplecount, int schhour, int money, int schday) {
		this.kind = kind;
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
		this.peoplecount = peoplecount;
		this.schhour = schhour;
		this.money = money;
		this.schday = schday;
	}

	
	public Kind getKind() {
		return kind;
	}

	public int getSerial() {
		return snum;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return mon;
	}

	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return min;
	}
	
	public int getPeoplecount() {
		return peoplecount;
	}
	
	public int getSchhour() {
		return schhour;
	}
	
	public int getMoney() {
		return money;
	}
	
	public int getSchday() {
		return schday;
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

	public void setPeoplecount(int peoplecount) throws Exceptions {
		if (peoplecount < 1) {
			throw new Exceptions();
		}
		this.peoplecount = peoplecount;
	}
	
	public void setSchhour(int schhour) throws Exceptions {
		if (schhour < 0) {
			throw new Exceptions();
		}
		this.schhour = schhour;
	}

	public void setMoney(int money) throws Exceptions {
		if (money < 0) {
			throw new Exceptions();
		}
		this.money = money;
	}

	public void setSchday(int schday) throws Exceptions {
		if (schday < 1) {
			throw new Exceptions();
		}
		this.schday = schday;
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
	
	public void setPeoplecount(Scanner input) {
		int peoplecount = -1;
		while (peoplecount < 1) {
			System.out.print("How many people participate? : ");
			peoplecount = input.nextInt();
			try {
				this.setPeoplecount(peoplecount);
			} catch (Exceptions e) {
				System.out.println("Please type correct integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public void setSchhour(Scanner input) {
		int schhour = -1;
		while (schhour < 1) {
			System.out.print("How much time (hour) you planned to this schedule? : ");
			schhour = input.nextInt();
			try {
				this.setSchhour(schhour);
			} catch (Exceptions e) {
				System.out.println("Please type correct integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public void setMoney(Scanner input) {
		int money = -1;
		while (money < 0) {
			System.out.print("How much money do you have? (KRW) : ");
			money = input.nextInt();
			try {
				this.setMoney(money);
			} catch (Exceptions e) {
				System.out.println("Please type correct integer.");
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public void setSchday(Scanner input) {
		int schday = -1;
		while (schday < 1) {
			System.out.print("How much time (day) you planned to this schedule? : ");
			schday = input.nextInt();
			try {
				this.setSchhour(schday);
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