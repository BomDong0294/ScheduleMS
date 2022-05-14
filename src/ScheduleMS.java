import java.util.InputMismatchException;
import java.util.Scanner;
public class ScheduleMS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScheduleMethod schfunction = new ScheduleMethod(input); // SchManager 클래스 호출
		selectMenu(input, schfunction);
		System.out.println("The Program is ended."); //프로그램 종료 알림
	}
	
	public static void selectMenu(Scanner input, ScheduleMethod schfunction) {
		int num = 0; // 단축번호 변수 선언 및 초기화
		while (num != 6) { // 6이 나올때까지 반복
			try {
				viewMenu();
				num = input.nextInt(); // 단축번호 입력
				System.out.println("------------------------------------------------------");
				switch (num) {
				case 1:
					schfunction.addSchedule(); // 스케줄 추가 함수 호출
					break;
				case 2:
					schfunction.deleteSchedule(); // 스케줄 삭제 함수호출
					break;
				case 3:
					schfunction.editSchedule(); // 스케줄 편집함수 호출
					break;
				case 4:
					schfunction.viewOneSchedule(); // 스케줄 보기 함수 호출
					break;
				case 5:
					schfunction.viewAllSchedules(); // 전체 스케줄 보기 함수 호출
				case 6:
					break;
				default:
					System.out.println("Please type Correct Number."); // 정정 요청
					System.out.println("-------------------------Retype-----------------------");
					break;
				}
			} catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 ~ 6.");
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