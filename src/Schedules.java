public class Schedules {
	private String sch; // 일정 종류 변수 선언
	private int year; // 연도 변수 선언
	private int mon; // 월 변수 선언
	private int day; // 일 변수 선언
	private int snum; // 고유번호 변수 선언
	private int hour; // 시 변수 선언
	private int min; // 분 변수 선언
	
	Schedules() {
		
	}
	
	public String getSchedule() {
		return sch; // 스케줄 반환 메서드 추가
	}
	
	public void setSchedule(String sch) {
		this.sch = sch; // 스케줄 지칭 메서드 추가
	}
	
	public int getSerial() {
		return snum; // 고유번호 반환 메서드 추가
	}
	
	public void setSerial(int snum) {
		this.snum = snum; // 고유번호 지칭 메서드 추가
	}
	
	public int getYear() {
		return year; // 연도 반환 메서드 추가
	}
	
	public void setYear(int year) {
		this.year = year; // 연도 지칭 메서드 추가
	}
	
	public int getMonth() {
		return mon; // 월 반환 메서드 추가
	}
	
	public void setMonth(int mon) {
		this.mon = mon; // 월 지칭 메서드 추가
	}
	
	public int getDay() {
		return day; // 일 반환 메서드 추가
	}
	
	public void setDay(int day) {
		this.day = day; // 일 지칭 메서드 추가
	}
	
	public int getHour() {
		return hour; // 시 반환 메서드 추가
	}
	
	public void setHour(int hour) {
		this.hour = hour; // 시 지칭 메서드 추가
	}
	
	public int getMinute() {
		return min; // 분 반환 메서드 추가
	}
	
	public void setMinute(int min) {
		this.min = min; // 분 지칭 메서드 추가
	}
	
	
	Schedules(String sch, int snum, int year, int mon, int day, int hour, int min) {
		this.sch = sch;
		this.snum = snum;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
	} // 스케줄 메서드 추가
	
}
