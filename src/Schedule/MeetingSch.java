package Schedule;

import java.util.Scanner;

public class MeetingSch extends Schedule implements ScheduleInput { // 일반 스케줄 클래스를 상속받음
	
	protected int schhour; // 일정 시간 변수 선언

	public MeetingSch(ScheduleKind kind) {
		super(kind);
	} // 미팅 스케줄 kind 변수만 있는 생성자 선언 
	
	public MeetingSch(ScheduleKind kind, int snum, int year, int mon, int day, int hour, int min, int peoplecount, int schhour) {
		super(kind);
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
		this.peoplecount = peoplecount;
		this.schhour = schhour;
	} // 미팅 스케줄 생성자 선언 및 저장
	
	public void getScheduleInput(Scanner input) { // meeting에 맞는 추상화된 스케줄 입력 메서드 선언
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
			System.out.print("Does professor participate that meeting? (Y/N) : ");
			res = input.next().charAt(0); // 교수님이 회의에 참가하시면?
			if (res == 'y' || res == 'Y') {
				System.out.println("All people should participate this meeting. (10 people)");
				this.setPeoplecount(10); // 전원참석이므로 연구실 인원(10명)만큼 저장
				System.out.print("How much time you planned? (At hour) : ");
				int schhour = input.nextInt();
				this.setSchhour(schhour); // 예정된 시간 입력 후 저장
				break;
			} else if (res == 'n' || res == 'N') {
				System.out.print("How many people participate this meeting? : ");
				int peoplecount = input.nextInt();
				this.setPeoplecount(peoplecount); // 선택 참석이므로 인원을 직접 입력 후 저장
				System.out.print("How much time you planned? (At hour) : ");
				int schhour = input.nextInt();
				this.setSchhour(schhour); // 예정된 시간 입력 후 저장
				break;
			} else {
			}
		}
	}
	
	public void printInfo() { // 정보를 출력하는 메서드
		String skind = "Meeting"; //kind 변수 초기화
		System.out.printf("Your %s is %d/%02d/%02d",skind,year,mon,day); // 날짜 출력
		System.out.printf(" %02d:%02d\n", hour, min); // 시간 출력
		System.out.printf("%d people participate the meeting.\n", peoplecount); // 참여 인원수 출력
		System.out.printf("%dhour meeting will be held.\n", schhour); // 회의 시간 출력
	}
	
	// 회의 시간에 대한 Getter, Setter 선언
	public int getSchhour() {
		return schhour;
	}

	public void setSchhour(int schhour) {
		this.schhour = schhour;
	}
	
}