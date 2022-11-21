package november20Assignment;

import java.util.Scanner;

public class NumberPositiveOrNegative {
	
	public static void main(String[] args) {
		
		int Num;
		
		Scanner N = new Scanner(System.in);
		System.out.println("Enter a number :");
		Num = N.nextInt();
		
		if(Num > 0) {
			
			System.out.println("Number is positive");
		}
		else if(Num < 0){
			
			System.out.println("Number is negative");
		}
		else {
			
			System.out.println("Number is zero");
		}
	}
}
