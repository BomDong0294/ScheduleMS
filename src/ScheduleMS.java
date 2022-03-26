import java.util.Scanner;

public class ScheduleMS {

	public static void main(String[] args) {
		int year = 0, mon = 0, day = 0, num = 0; // 날짜 변수 선언 및 초기화
		String sch = null; // 일정 종료 변수 선언 및 초기화
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Schedule"); // 스케줄 추가
			System.out.println("2. Delete Schedule"); // 스케줄 삭제
			System.out.println("3. Edit Schedule"); // 스케줄 편집
			System.out.println("4. View Schedule"); // 스케줄 표시
			System.out.println("5. Show a menu"); // 메뉴 표시
			System.out.println("6. Exit"); // 종료
			System.out.print("Select one number between 1 to 6 : "); 
			num = input.nextInt(); // 단축번호 입력
			System.out.println("------------------------------------------------------");
			
			switch (num) {
			case 1:
				addSchedule(year, mon, day, num, sch); // 스케줄 추가 함수 호출
				break;
			case 2:
				deleteSchedule(year, mon, day, num, sch); // 스케줄 삭제 함수호출
				break;
			case 3:
				editSchedule(year, mon, day, num, sch); // 스케줄 편집함수 호출
				break;
			case 4:
				viewStudents(year, mon, day, num, sch); // 스케줄 보기 함수 호출
				break;
			case 5:
				backmenu(); // 메뉴 복귀 함수 호출
				break;
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
	
	public static void addSchedule(int year, int mon, int day, int num, String sch) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type your schedule category (ex : Meeting) : ");
		sch = input.next(); // 스케줄 추가
		System.out.print("Date's year? : ");
		year = input.nextInt(); // 연도 추가
		System.out.print("Date's month? : ");
		mon = input.nextInt(); // 달 추가 
		System.out.print("Date's day? : ");
		day = input.nextInt(); // 일 추가
		System.out.println("The information is collected.");
		System.out.println("------------------------------------------------------");
	}
	
	public static void deleteSchedule(int year, int mon, int day, int num, String sch) {
		sch = null;
		year = 0;
		mon = 0;
		day = 0; // 모든 데이터 초기화
		System.out.println("The data is deleted.");
		System.out.println("------------------------------------------------------");
		
	}
	
	public static void editSchedule(int year, int mon, int day, int num, String sch) {
		Scanner input = new Scanner(System.in);
		System.out.println("Retype Your Schedule.");
		System.out.print("Type your schedule category (ex : Meeting) : ");
		sch = input.next();
		System.out.print("Date's year? : ");
		year = input.nextInt();
		System.out.print("Date's month? : ");
		mon = input.nextInt();
		System.out.print("Date's day? : ");
		day = input.nextInt(); // 데이터 편집 
		System.out.println("The information is collected.");
		System.out.println("------------------------------------------------------");
	}
	
	public static void viewStudents(int year, int mon, int day, int num, String sch) {
		System.out.printf("Your %s is going to be %d/%d/%d.\n", sch, year, mon, day);
		System.out.println("------------------------------------------------------"); // 데이터 표기
	}
	
	public static void backmenu() {
		System.out.println("Return to Menu...."); // 메뉴 복귀
		System.out.println("------------------------------------------------------");
	}
}
