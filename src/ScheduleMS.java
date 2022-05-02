import java.util.Scanner;
public class ScheduleMS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SchManager schfunction = new SchManager(input); // SchManager 클래스 호출
		int num = 0; // 단축번호 변수 선언 및 초기화
		while (num != 6) { // 6이 나올때까지 반복
			
			schfunction.viewMenu();
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
				System.out.println("------------------------------------------------------");
				break;
			}
		}
		System.out.println("The Program is ended."); //프로그램 종료 알림
	}
	

}