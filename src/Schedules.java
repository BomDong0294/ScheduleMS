
public class Schedules {
	
	String sch;
	int serial;
	int year;
	int mon;
	int day;
	int hour;
	int min;
	
	public Schedules() {
		
	}
	
	public Schedules(String sch, int serial, int year, int mon, int day, int hour, int min) {
		this.sch = sch;
		this.serial = serial;
		this.year = year;
		this.mon = mon;
		this.day = day;
		this.hour = hour;
		this.min = min;
	}
	
	public void printSch() {
		System.out.printf("The %s will be at %d/%d/%d %d:%d\n",sch,year,mon,day,hour,min);
		System.out.println("Schedule serial number : " + serial);
		
	}
}
