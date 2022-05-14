package Schedule;

import java.util.Scanner;

public class ShoppingSch extends Schedule { // 일반 스케줄 클래스를 상속받음
	
	protected int money; // 돈 변수 선언

	public ShoppingSch(ScheduleKind kind) {
		super(kind);
	} // 쇼핑 스케줄 kind 변수만 있는 생성자 선언 
	
	public ShoppingSch(ScheduleKind kind, int snum, int year, int mon, int day, int hour, int min, int peoplecount, int money) {
		super(kind);
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
		this.peoplecount = peoplecount;
		this.money = money;
	} // 쇼핑 스케줄 생성자 선언 및 저장

	public void getScheduleInput(Scanner input) { // shopping에 맞는 추상화된 스케줄 입력 메서드 선언
		setSerial(input);
		setYear(input);
		setMonth(input);
		setDay(input);
		setHour(input);
		setMinute(input);
		setShoppingsch(input);
	}
	
	public void printInfo() { // 정보를 출력하는 메서드
		String skind = getKindString(); //kind 변수 초기화
		System.out.printf("Your %s is %d/%02d/%02d",skind,year,mon,day); // 날짜 출력
		System.out.printf(" %02d:%02d\n", hour, min); // 시간 출력
		System.out.printf("You have %d won. (KRW)\n", money); // 소유중인 금액 출력
		if (this.peoplecount >= 2) {
			System.out.printf("%d people participate in the shopping.\n", peoplecount); // 참여 인원수 출력
		} else {
			System.out.printf("%d person go to the shopping.\n", peoplecount); // 참여 인원수 출력
		}
	}
	
	public void setMoney(ScheduleInput schedule, Scanner input) {
		System.out.print("How much money do you have? : ");
		int money = input.nextInt();
		this.setMoney(money); // 돈 변수 초기화
	}

	public void setPeoplecount(ScheduleInput schedule, Scanner input) {
		System.out.print("How many people go shopping with you? : ");
		int peoplecount = input.nextInt();
		this.setPeoplecount(peoplecount+1); // 추가된 인원에 자신을 추가한 값을 저장함
	}

	public void setShoppingsch(Scanner input) {
		char res = 'a';
		while (res != 'y' && res != 'Y' && res != 'n' && res != 'N') {
			System.out.print("Does some people participates? : (Y/N) : ");
			res = input.next().charAt(0); // 만약 혼자 쇼핑을 하지 않는다면?
			if (res == 'y' || res == 'Y') {
				setPeoplecount(this, input);
				setMoney(this, input);
				break;
			} else if (res == 'n' || res == 'N') {
				this.setPeoplecount(1); // 혼자만 가므로 1을 저장
				setMoney(this, input);
				break;
			} else {
			}
		}
	}
	
	// money 변수에 대한 getter 및 setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}