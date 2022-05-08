package Schedule;

public abstract class Schedule {
	protected ScheduleKind kind = ScheduleKind.Meeting;
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
	public Schedule(ScheduleKind kind) {
		this.kind = kind;
	}
	public ScheduleKind getKind() {
		return kind;
	}
	public void setKind(ScheduleKind kind) {
		this.kind = kind;
	}
	public int getSerial() {
		return snum;
	}
	public void setSerial(int snum) {
		this.snum = snum;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year; 
	}
	public int getMonth() {
		return mon;
	}
	public void setMonth(int mon) {
		this.mon = mon; 
	}
	public int getDay() {
		return day; 
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return min;
	}
	public void setMinute(int min) {
		this.min = min;
	}
	public int getPeoplecount() {
		return peoplecount;
	}
	public void setPeoplecount(int peoplecount) {
		this.peoplecount = peoplecount;
	}
}