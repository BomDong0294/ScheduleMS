package Schedule;

import java.util.Scanner;

public class RestSch extends Schedule { // 일반 스케줄 클래스를 상속받음
	
	protected int schday; // 예정 휴식기간 변수 추가

	public RestSch(ScheduleKind kind) {
		super(kind);
	} // 미팅 스케줄 kind 변수만 있는 생성자 선언 
	
	public RestSch(ScheduleKind kind, int snum, int year, int mon, int day, int peoplecount, int money, int schhour, int schday) {
		super(kind);
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.peoplecount = peoplecount;
		this.schday = schday;
	} // 휴식 스케줄 생성자 추가
	
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
	
	// 예정 휴식 기간 변수에 대한 getter, setter
	public int getSchday() {
		return schday;
	}

	public void setSchday(int schday) {
		this.schday = schday;
	}
	
	public void setSchday(ScheduleInput schedule, Scanner input) {
		System.out.print("How much you sleep at there? : ");
		int setday = input.nextInt();
		this.setSchday(setday); // 숙박하는 기간 저장 (일 단위)
	}
	
	public void setPeoplecount(ScheduleInput schedule, Scanner input) {
		System.out.print("How many people participate in travel? : ");
		int peoplecount = input.nextInt();
		this.setPeoplecount(peoplecount); // 참석 인원 변수 입력 및 저장
	}

	public void setRestsch(Scanner input) {
		char res = 'a';
		while (res != 'y' && res != 'Y' && res != 'n' && res != 'N') {
			System.out.print("Will you sleep two days or more? (Y/N) : ");
			res = input.next().charAt(0); // 숙박일이 2일 이상이면?
			if (res == 'y' || res == 'Y') { // 만약 해당되면
				setSchday(this, input);
				setPeoplecount(this, input);
				break; // 반복문 탈출
			} else if (res == 'n' || res == 'N') { // 만약 해당되지 않는다면
				setPeoplecount(this, input);
				this.setSchday(1); // 당일치기이므로 1일만 저장
				break; // 반복문 탈출
			} else {
			}
		}
	}
	
}