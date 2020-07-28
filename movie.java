import java.util.*;
public class movie{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your seat: ");
		String seat = scanner.next();
		String ee[] = seat.split("");
		System.out.println(ee[0]);
		System.out.println(ee[1]);
		int lenghtRow = 7;
		int lenghtCol = 10;
		int arr[][] = new int[lenghtRow][lenghtCol];
		// for(int i = 0;i<lenghtCol;i++){
		// 	for(int j = 0;j<lenghtRow;j++){
		// 		arr[i][j] = 0;
		// 	}
		// }
		// arr[4][3] = 1;
		
		//arr[Integer.parseInt(ee[0])-1][Integer.parseInt(ee[1])-1] = 1;
		//arr[getASCII(ee[0])-65][Integer.parseInt(ee[1])-1] = 1;
		
		for(int i = 1;i<=lenghtCol;i++){
			if(i == 1) System.out.print("*");
			System.out.print("-"+i);
		}
		
			System.out.println();
		for(int i = 0;i<lenghtRow;i++){
			System.out.printf("%c", i+65);
			for(int j = 0;j<lenghtCol;j++){
				
				if(arr[i][j] == 0)
					System.out.print("-0");
				else
					System.out.print("-1");
				if(j == lenghtCol-1)
					System.out.println();
			}
		}
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