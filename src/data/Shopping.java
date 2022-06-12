package data;

import java.util.Scanner;

public class Shopping extends Schedule { // 일반 스케줄 클래스를 상속받음
	private static final long serialVersionUID = 1158286935571549727L;
	
	public Shopping(Kind kind) {
		super(kind);
	} // 쇼핑 스케줄 kind 변수만 있는 생성자 선언 

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

	public void setShoppingsch(Scanner input) {
		char res = 'a';
		while (res != 'y' && res != 'Y' && res != 'n' && res != 'N') {
			System.out.print("Does some people participates? : (Y/N) : ");
			res = input.next().charAt(0); // 만약 혼자 쇼핑을 하지 않는다면?
			if (res == 'y' || res == 'Y') {
				setPeoplecount(input);
				setMoney(input);
				break;
			} else if (res == 'n' || res == 'N') {
				System.out.println("Type 1.");
				int a = 0;
				while (a != 1) {
					setPeoplecount(input);
					if (getPeoplecount() == 1) break;
				}
				setMoney(input);
				break;
			} else {
			}
		}
	}
}