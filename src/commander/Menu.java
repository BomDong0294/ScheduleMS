package data;
import java.util.InputMismatchException;
import java.util.Scanner;
import function.ScheduleMethod;
import log.EventLogger;
public class Menu {

	static EventLogger logger = new EventLogger("log.txt");
	// 텍스트 파일 하나를 logger를 통해 생성함
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScheduleMethod schfunction = EventLogger.getObject("ScheduleMethod.ser");
		if (schfunction == null) {
			schfunction = new ScheduleMethod(); // SchManager 클래스 호출
		}
		selectMenu(input, schfunction);
		EventLogger.putObject(schfunction, "ScheduleMethod.ser");
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
					schfunction.addSchedule(input);
					logger.log("Add a schedule");
					break;
				case 2:
					schfunction.deleteSchedule(input); // 스케줄 삭제 함수호출
					logger.log("Delete a schedule");
					break;
				case 3:
					schfunction.editSchedule(input); // 스케줄 편집함수 호출
					logger.log("Edit a schedule");
					break;
				case 4:
					schfunction.viewOneSchedule(input); // 스케줄 보기 함수 호출
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
	
	
}