import java.util.*;
public class movie{
	public static void main(String[] args){
		System.out.println("username: ");
		System.out.println("password: ");
		System.out.println("----------");
		System.out.println("welcome to booking movie ticket!");
		System.out.println("=======================================================");
		System.out.println("1.Booking || 2. Change pass || 3.View history || 4.Exit");
		System.out.println("Choose: 1");
		System.out.println("Please choose the day you want: 27/7/2020");
		System.out.println("=======================================================");
		System.out.println("*27/7/2020:");
		System.out.println("1.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4 || seat 3/100");
		System.out.println("2.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4 || seat 3/100");
		System.out.println("3.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4 || seat 3/100");
		System.out.println("4.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4 || seat 3/100");
		System.out.println("There are films in 27/7/2020! Choose a compatible film number: 1");
		System.out.println("*-1-2-3-4-5-6-7-8-9");
		System.out.println("A-o-o-o-o-o-o-o-o-o");
		System.out.println("B-o-o-o-o-o-o-o-o-o");
		System.out.println("C-o-o-o-o-o-o-o-o-o");
		System.out.println("D-o-x-x-x-o-o-o-o-o");
		System.out.println("E-o-o-o-o-o-o-o-o-o");
		System.out.println("F-o-o-o-o-o-o-o-o-o");
		System.out.println("Choose a seat: E5");
		System.out.println("Here is your history booking: ");
		System.out.println("1.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4 || E5");
		System.out.println("Continue? (Y/N): Y");
		
		System.out.println("=======================================================");
		System.out.println("1.Booking || 2. Change pass || 3.View history || 4.Exit");
		System.out.println("Choose: 2");
		System.out.println("Input your old password: 123456");
		System.out.println("Input your new password: aaaaaa");
		System.out.println("Your password has changed successfully!");
		System.out.println("Continue? (Y/N): N");
		System.out.println("Good bye!");
		
		System.out.println("Welcome admin!");
		System.out.println("======================================");
		System.out.println("1.CRUD Movie || 2. CRUD User || 3.Exit");		
		System.out.println("Choose: 1");
		System.out.println("================================================");
		System.out.println("1.Add a film: || 2. Delete film || 3.Update film");		
		System.out.println("Choose: 1");
		System.out.println("Input name of film: ");
		System.out.println("Input theater: ");
		System.out.println("Input time start: ");
		System.out.println("Input time end: ");
		System.out.println("Successfully!");
		System.out.println("Continue in CRUD Movie (Y/N)?: Y");
		System.out.println("================================================");
		System.out.println("1.Add a film: || 2. Delete film || 3.Update film");		
		System.out.println("Choose: 2");
		System.out.println("Here is a list of film. Choose a compatible number to delete: 2");
		System.out.println("1.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4|");
		System.out.println("2.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4");
		System.out.println("3.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4");
		System.out.println("4.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4");
		System.out.println("Deleted successfully!");
		System.out.println("Continue in CRUD Movie (Y/N)?: Y");
		System.out.println("================================================");
		System.out.println("1.Add a film: || 2. Delete film || 3.Update film");		
		System.out.println("Choose: 3");
		System.out.println("Here is a list of film. Choose a compatible number to update: 3");
		System.out.println("1.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4");
		System.out.println("2.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4");
		System.out.println("3.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4");
		System.out.println("4.Avengers4 || from 13:00:00 to 16:00:00 || theater: 4");
		System.out.println("Input name of film: ");
		System.out.println("Input theater: ");
		System.out.println("Input time start: ");
		System.out.println("Input time end: ");
		System.out.println("Successfully!");
		System.out.println("Continue in CRUD Movie (Y/N)?: N");
		System.out.println("Continue (Y/N)?: Y");
		
		
		System.out.println("======================================");
		System.out.println("1.CRUD Movie || 2. CRUD User || 3.Exit");
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Input your seat: ");
		String seat = scanner.next();
		String ee[] = seat.split("");
		System.out.println(ee[0]);
		System.out.println(ee[1]);
		int lenghtRow = 5;
		int lenghtCol = 5;
		int arr[][] = new int[lenghtRow][lenghtCol];
		for(int i = 0;i<lenghtCol;i++){
			for(int j = 0;j<lenghtRow;j++){
				arr[i][j] = 0;
			}
		}
		arr[4][3] = 1;
		
		//arr[Integer.parseInt(ee[0])-1][Integer.parseInt(ee[1])-1] = 1;
		arr[getASCII(ee[0])-65][Integer.parseInt(ee[1])-1] = 1;
		
		for(int i = 1;i<=lenghtCol;i++){
			if(i == 1) System.out.print("*");
			System.out.print("-"+i);
		}
		
			System.out.println();
		for(int i = 0;i<lenghtCol;i++){
			System.out.printf("%c", i+65);
			for(int j = 0;j<lenghtRow;j++){
				
				if(arr[i][j] == 0)
					System.out.print("-0");
				else
					System.out.print("-1");
				if(j == lenghtRow-1)
					System.out.println();
			}
		}*/
	}
	public static int getASCII(String c){
		if(c.equalsIgnoreCase("A")){
			return 65;
		}
		if(c.equalsIgnoreCase("B")){
			return 66;
		}
		return 0;
	}
}