import java.util.Scanner;

public class ScheduleMS {

	public static void main(String[] args) {
		int year = 0, mon = 0, day = 0, num = 0;
		String sch = null;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add Schedule");
			System.out.println("2. Delete Schedule");
			System.out.println("3. Edit Schedule");
			System.out.println("4. View Students");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 to 6 : ");
			num = input.nextInt();
			System.out.println("------------------------------------------------------");
			
			switch (num) {
			case 1:
				System.out.print("Type your schedule category (ex : Meeting) : ");
				sch = input.next();
				System.out.print("Date's year? : ");
				year = input.nextInt();
				System.out.print("Date's month? : ");
				mon = input.nextInt();
				System.out.print("Date's day? : ");
				day = input.nextInt();
				System.out.println("The information is collected.");
				System.out.println("------------------------------------------------------");
				break;
			case 2:
				sch = null;
				year = 0;
				mon = 0;
				day = 0;
				System.out.println("The data is deleted.");
				System.out.println("------------------------------------------------------");
				break;
			case 3:
				System.out.println("Retype Your Schedule.");
				System.out.print("Type your schedule category (ex : Meeting) : ");
				sch = input.next();
				System.out.print("Date's year? : ");
				year = input.nextInt();
				System.out.print("Date's month? : ");
				mon = input.nextInt();
				System.out.print("Date's day? : ");
				day = input.nextInt();
				System.out.println("The information is collected.");
				System.out.println("------------------------------------------------------");
				break;
			case 4:
				System.out.printf("Your %s is going to be %d/%d/%d.\n", sch, year, mon, day);
				System.out.println("------------------------------------------------------");
				break;
			case 5:
				System.out.println("Return to Menu....");
				System.out.println("------------------------------------------------------");
				break;
			case 6:
				break;
			default:
				System.out.println("Please type Correct Number.");
				System.out.println("------------------------------------------------------");
				break;
			}
		}
		System.out.println("The Program is ended.");
	}

}
