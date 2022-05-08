package Schedule;

import java.util.Scanner;

public interface ScheduleInput {
	
	public int getSerial(); // 인터페이스 내에서 getSerial() 메서드 선언
	
	public void getScheduleInput(Scanner input);
	// 인터페이스 내에서 getScheduleInput() 메서드 선언
	
	public void printInfo(); // 인터페이스 내에서 printInfo() 메서드 선언

}
