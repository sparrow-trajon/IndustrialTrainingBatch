package assignment;

import java.util.Scanner;


public class Problem01 {
	public static void main(String[] args) {
		
		// take this number from user.
	/**
	 * Display the name of the day.
	 * suppose entered number is 1 then output should be Monday 
	 * Input 2 Output Tuesday
	 * Input 3 OP Wednesday 
	 * 
	 * @param i
	 */
//		int i ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number");
		
		int i = sc.nextInt();
		
		
		display(i);
	}
	public static void display(int i) {
	
	
	switch(i) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
	
		break;
		default:
			System.out.println("Invalid Day Name");
	}
	}
	}
