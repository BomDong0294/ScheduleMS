package data;

import java.util.Scanner;

public class Rest extends Schedule { // 일반 스케줄 클래스를 상속받음
	private static final long serialVersionUID = 6184538990603416133L;
	
	public Rest(Kind kind) {
		super(kind);
	} // 미팅 스케줄 kind 변수만 있는 생성자 선언 

	public void getScheduleInput(Scanner input) { // resting에 맞는 추상화된 스케줄 입력 메서드 선언
		setSerial(input);
		setYear(input);
		setMonth(input);
		setDay(input);
		setRestsch(input);
	}
	
	public void printInfo() { // 정보를 출력하는 메서드
		String skind = getKindString(); //kind 변수 초기화
		System.out.printf("Your %s is %d/%02d/%02d\n",skind,year,mon,day); // 날짜 출력
		if (this.peoplecount >= 2) {
			System.out.printf("%d people participate in the resting.\n", peoplecount); // 참여 인원 출력
		} else {
			System.out.printf("%d person participates in the resting.\n", peoplecount); // 참여 인원 출력
		}
		
		System.out.printf("%d day planned.\n",schday); // 예정 휴식 기간 출력
	}

	public void setRestsch(Scanner input) {
		char res = 'a';
		while (res != 'y' && res != 'Y' && res != 'n' && res != 'N') {
			System.out.print("Will you sleep two days or more? (Y/N) : ");
			res = input.next().charAt(0); // 숙박일이 2일 이상이면?
			if (res == 'y' || res == 'Y') { // 만약 해당되면
				setSchday(input);
				setPeoplecount(input);
				break; // 반복문 탈출
			} else if (res == 'n' || res == 'N') { // 만약 해당되지 않는다면
				System.out.println("Type 1.");
				int a = 0;
				while (a != 1) {
					setSchday(input);
					if (getSchday() == 1) break;
				}
				setPeoplecount(input);
				break; // 반복문 탈출
			} else {
			}
		}
	}

}