package data;

import java.util.Scanner;
import Exceptions.Exceptions;

public interface InputInterface {
	
	public Kind getKind();
	
	public int getSerial(); // 인터페이스 내에서 getSerial() 메서드 선언
	public void setSerial(int snum) throws Exceptions;
	public void setSerial(Scanner input) throws Exceptions;
	
	public int getYear();
	public void setYear(int year) throws Exceptions;
	public void setYear(Scanner input) throws Exceptions;
	
	public int getMonth();
	public void setMonth(int mon) throws Exceptions;
	public void setMonth(Scanner input);
	
	public int getDay();
	public void setDay(int day) throws Exceptions;
	public void setDay(Scanner input);
	
	public int getHour();
	public void setHour(int hour) throws Exceptions;
	public void setHour(Scanner input);
	
	public int getMinute();
	public void setMinute(int min) throws Exceptions;
	public void setMinute(Scanner input);
	
	public int getPeoplecount();
	public void setPeoplecount(int peoplecount) throws Exceptions;
	
	public int getSchhour();
	public void setSchhour(int schhour) throws Exceptions;
	
	public int getMoney();
	public void setMoney(int money) throws Exceptions;
	
	public int getSchday();
	public void setSchday(int schday) throws Exceptions;
	
	public void getScheduleInput(Scanner input);
	// 인터페이스 내에서 getScheduleInput() 메서드 선언
	
	public void printInfo(); // 인터페이스 내에서 printInfo() 메서드 선언
	
	public void setPeoplecount(Scanner input);
	public void setSchhour(Scanner input);
	public void setMoney(Scanner input);
	public void setSchday(Scanner input);

}
