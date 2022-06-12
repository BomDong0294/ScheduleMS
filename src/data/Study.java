package data;

import java.util.Scanner;

public class Study extends Schedule { // 일반 스케줄 클래스를 상속받음
	private static final long serialVersionUID = 1915738492071953253L;
	
	public Study(Kind kind) {
		super(kind);
	} // 공부 스케줄 kind 변수만 있는 생성자 선언 
	
	public void getScheduleInput(Scanner input) { // studying에 맞는 추상화된 스케줄 입력 메서드 선언
		setSerial(input);
		setYear(input);
		setMonth(input);
		setDay(input);
		setHour(input);
		setMinute(input);
		setStudysch(input);
	}
	
	public void printInfo() { // 정보를 출력하는 메서드
		String skind = getKindString(); //kind 변수 초기화
		System.out.printf("Your %s is %d/%02d/%02d",skind,year,mon,day);
		System.out.printf(" %02d:%02d\n", hour, min);
		if (this.peoplecount >= 2) {
			System.out.printf("%d people participate in the studying.\n", peoplecount);
		} else {
			System.out.printf("%d person participates in the studying.\n", peoplecount);
		}
		System.out.printf("%dhour studying will be held.\n", schhour);
	}

	public void setStudysch(Scanner input) {
		char res = 'a';
		while (res != 'y' && res != 'Y' && res != 'n' && res != 'N') {
			System.out.print("Is it a group project? (Y/N) : ");
			res = input.next().charAt(0); // 만약 그룹 프로젝트이면?
			if (res == 'y' || res == 'Y') {
				setPeoplecount(input);
				setSchhour(input);
				break;
			} else if (res == 'n' || res == 'N') {
				System.out.println("Type 1.");
				int a = 0;
				while (a != 1) {
					setPeoplecount(input);
					if (getPeoplecount() == 1) break;
				}
				setSchhour(input);
			} else {
			}
		}
	}
}