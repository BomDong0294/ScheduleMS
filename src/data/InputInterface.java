package data;

import java.util.Scanner;

import Exceptions.Exceptions;

public interface InputInterface {
	
	public int getSerial(); // 인터페이스 내에서 getSerial() 메서드 선언
	public int getYear();
	public int getMonth();
	public int getDay();
	public int getHour();
	public int getMinute();
	public int getPeoplecount();
	public int getSchhour();
	public int getMoney();
	public int getSchday();
	public Kind getKind();
	
	public void getScheduleInput(Scanner input);
	// 인터페이스 내에서 getScheduleInput() 메서드 선언
	
	public void printInfo(); // 인터페이스 내에서 printInfo() 메서드 선언
	public void setSerial(Scanner input) throws Exceptions;
	public void setYear(Scanner input) throws Exceptions;
	public void setMonth(Scanner input);
	public void setDay(Scanner input);
	public void setHour(Scanner input);
	public void setMinute(Scanner input);

}
