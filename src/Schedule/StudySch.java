package Schedule;

import java.util.Scanner;

public class StudySch extends Schedule implements ScheduleInput { // 일반 스케줄 클래스를 상속받음
	
	protected int schhour; // 일정 시간 변수 선언

	public StudySch(ScheduleKind kind) {
		super(kind);
	} // 공부 스케줄 kind 변수만 있는 생성자 선언 
	
	public StudySch(ScheduleKind kind, int snum, int year, int mon, int day, int hour, int min, int peoplecount, int money, int schhour, int schday) {
		super(kind);
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
		this.peoplecount = peoplecount;
		this.schhour = schhour;
	} // 공부 스케줄 생성자 선언 및 저장
	
	public void getScheduleInput(Scanner input) { // studying에 맞는 추상화된 스케줄 입력 메서드 선언
		
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
		
		char res = 'a';
		while (res != 'y' && res != 'Y' && res != 'n' && res != 'N') {
			System.out.print("Is it a group project? (Y/N) : ");
			res = input.next().charAt(0); // 만약 그룹 프로젝트이면?
			if (res == 'y' || res == 'Y') {
				System.out.print("How many people participate in the project? : ");
				int peoplecount = input.nextInt();
				this.setPeoplecount(peoplecount+1); // 참가하는 인원에 자신의 인원을 더한 값을 저장
				System.out.print("How much time you scheduled? : ");
				int schhour = input.nextInt();
				this.setSchhour(schhour); // 예정 일정 시간 입력 및 저장
				break;
			} else if (res == 'n' || res == 'N') {
				System.out.print("How much time you scheduled? : ");
				int schhour = input.nextInt(); // 스케줄 시간만 저장
				this.setSchhour(schhour);
				this.setPeoplecount(1); // 혼자이므로 1을 저장
			} else {
			}
		}
	}
	public void printInfo() { // 정보를 출력하는 메서드
		String skind = "Studying"; //kind 변수 초기화
		System.out.printf("Your %s is %d/%02d/%02d",skind,year,mon,day);
		System.out.printf(" %02d:%02d\n", hour, min);
		System.out.printf("%d people participate in the studying.\n", peoplecount);
		System.out.printf("%dhour studying will be held.\n", schhour);
	}

	public int getSchhour() {
		return schhour;
	}

	public void setSchhour(int schhour) {
		this.schhour = schhour;
	}
}