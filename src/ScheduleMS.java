import java.util.Scanner;

public class ScheduleMS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SchManager schManager = new SchManager(input);
		int num = 0;
		while (num != 5) {
			System.out.println("1. Add Schedule"); // 스케줄 추가
			System.out.println("2. Delete Schedule"); // 스케줄 삭제
			System.out.println("3. Edit Schedule"); // 스케줄 편집
			System.out.println("4. View Schedule"); // 스케줄 표시
			System.out.println("5. Exit"); // 종료
			System.out.print("Select one number between 1 to 5 : "); 
			num = input.nextInt(); // 단축번호 입력
			System.out.println("------------------------------------------------------");
			
			switch (num) {
			case 1:
				schManager.addSchedule(); // 스케줄 추가 함수 호출
				break;
			case 2:
				schManager.deleteSchedule(); // 스케줄 삭제 함수호출
				break;
			case 3:
				schManager.editSchedule(); // 스케줄 편집함수 호출
				break;
			case 4:
				schManager.viewSchedule(); // 스케줄 보기 함수 호출
				break;
			case 5:
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
