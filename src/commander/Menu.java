package commander;

import java.io.*;
import java.util.*;
import gui.WindowFrame;
import log.EventLogger;
public class Menu {

	static EventLogger logger = new EventLogger("log.txt");
	// 텍스트 파일 하나를 logger를 통해 생성함
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ScheduleFunction schfunction = getObject("ScheduleFunction.ser");
		if (schfunction == null) {
			schfunction = new ScheduleFunction(input);
		} else {
			schfunction.setScanner(input);
		}
		WindowFrame frame = new WindowFrame(schfunction);
		selectMenu(input, schfunction);
		putObject(schfunction, "ScheduleMethod.ser");
		System.out.println("The Program is ended."); //프로그램 종료 알림
	}
	
	public static void selectMenu(Scanner input, ScheduleFunction schfunction) {
		int num = -1; // 단축번호 변수 선언 및 초기화
		while (num != 6) { // 6이 나올때까지 반복
			try {
				viewMenu(); // 메뉴 출력 메서드 호출
				num = input.nextInt(); // 단축번호 입력
				System.out.println("------------------------------------------------------");
				switch (num) {
				case 1:
					schfunction.addSchedule();
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
					continue;
				}
			} catch(InputMismatchException e) {
				// 위 문장에서 문자를 삽입하는 예외가 발생하면
				System.out.println("Please put an integer between 1 ~ 6.");
				// 숫자를 다시 적도록 정정요청
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
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
	
	public static ScheduleFunction getObject(String filename) {
		ScheduleFunction schfunction = null;
		
		try { // 파일로 받아들이고 readObject()를 통해서 객체를 받아옴.
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			schfunction = (ScheduleFunction)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return schfunction; // 예외처리 및 파일을 받지 못하면 객체 반환
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 처리
		}
		return schfunction;
	}
	public static void putObject(ScheduleFunction schfunction, String filename) {
		try { // 객체를 텍스트 파일에 작성함.
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(schfunction);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 예외처리
		} catch (IOException e) {
			e.printStackTrace(); // 예외처리
		}
	}
}