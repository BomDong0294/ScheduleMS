import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;
public class ScheduleMS {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ScheduleMethod schfunction = getObject("ScheduleMethod.ser");
		if (schfunction == null) {
			schfunction = new ScheduleMethod(input); // SchManager 클래스 호출
		}
		selectMenu(input, schfunction);
		putObject(schfunction, "ScheduleMethod.ser");
		System.out.println("The Program is ended."); //프로그램 종료 알림
	}
	
	public static void selectMenu(Scanner input, ScheduleMethod schfunction) {
		int num = 0; // 단축번호 변수 선언 및 초기화
		while (num != 6) { // 6이 나올때까지 반복
			try {
				viewMenu(); // 메뉴 출력 메서드 호출
				num = input.nextInt(); // 단축번호 입력
				System.out.println("------------------------------------------------------");
				switch (num) {
				case 1:
					schfunction.addSchedule(); // 스케줄 추가 함수 호출
					logger.log("Add a schedule");
					break;
				case 2:
					schfunction.deleteSchedule(); // 스케줄 삭제 함수호출
					logger.log("Delete a schedule");
					break;
				case 3:
					schfunction.editSchedule(); // 스케줄 편집함수 호출
					logger.log("Edit a schedule");
					break;
				case 4:
					schfunction.viewOneSchedule(); // 스케줄 보기 함수 호출
					logger.log("View a schedule");
					break;
				case 5:
					schfunction.viewAllSchedules(); // 전체 스케줄 보기 함수 호출
					logger.log("View schedules");
					break;
				case 6:
					break;
				default:
					System.out.println("Please type Correct Number."); // 정정 요청
					System.out.println("-------------------------Retype-----------------------");
					break;
				}
			} catch(InputMismatchException e) {
				// 위 문장에서 문자를 삽입하는 예외가 발생하면
				System.out.println("Please put an integer between 1 ~ 6.");
				// 숫자를 다시 적도록 정정요청
				if (input.hasNext()) {
					input.next();
				}
				num = 0;
				System.out.println("-------------------------Retype-----------------------");
			}
		}
	}
	
	public static void viewMenu() { // 메뉴 출력 메서드
		System.out.println("1. Add Schedule"); // 스케줄 추가 표시
		System.out.println("2. Delete Schedule"); // 스케줄 삭제 표시
		System.out.println("3. Edit Schedule"); // 스케줄 편집 표시
		System.out.println("4. View One Schedule"); // 특정 스케줄 표시
		System.out.println("5. View All Schedule"); // 전체 스케줄 표시
		System.out.println("6. Exit"); // 종료 표시
		System.out.print("Select one number between 1 to 6 : "); //입력하라고 표시
	}
	
	public static ScheduleMethod getObject(String filename) {
		ScheduleMethod schfunction = null;
		FileInputStream file;
		try {
			file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			schfunction = (ScheduleMethod)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return schfunction;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return schfunction;
	}
	
	public static void putObject(ScheduleMethod schfunction, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(schfunction);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}