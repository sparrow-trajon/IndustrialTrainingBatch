package assignment;

import java.util.Scanner;

public class Usernumbers {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Input number: ");
	        int x = sc.nextInt();
	        
	        if (x > 0)
	        {
	            System.out.println("Number is positive");
	        }
	        else if (x < 0)
	        {
	            System.out.println("Number is negative");
	        }
	        else
	        {
	            System.out.println("Number is zero");
	        }
	}

}
