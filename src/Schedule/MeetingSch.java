package Schedule;

import java.util.Scanner;

public class MeetingSch extends Schedules { // 일반 스케줄 클래스를 상속받음
	
	public MeetingSch(ScheduleKind kind) {
		this.kind = kind;
	}
	
	public void getScheduleInput(Scanner input) { // meeting에 맞는 스케줄 입력 메서드 선언
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
		this.setMoney(-1); // 구별을 위한 돈 변수 초기화
		this.setSchday(-1); // 구별을 위한 예정일 변수 초기화
	}
}