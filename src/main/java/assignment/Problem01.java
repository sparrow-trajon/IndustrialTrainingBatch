package assignment;
import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		
		// take this number from user.System.out.println("Happy");
	int num = sc.nextInt();
	display(num);
	
		
	}
	
	/**
	 * Display the name of the day.
	 * suppose entered number is 1 then output should be Monday 
	 * Input 2 Output Tuesday
	 * Input 3 OP Wednesday 
	 * 
	 * @param i
	 */
	public static void display(int i) {
		
		
		switch (i) {
		
		case 1 : 
			System.out.println("Monday");
			break;
			
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3 : 
			System.out.println("Wednesday");
			break;
		case 4 : 
			System.out.println("Thrusday");
			break;
			
		case 5 : 
			System.out.println("Friday");
			break;
		case 6 : 
			System.out.println("Saturday");
			break;
		case 7 : 
			System.out.println("Sunday");
			break;
		
			
			
		}
			
		
	}
}
