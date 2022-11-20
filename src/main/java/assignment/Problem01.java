package assignment;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		System.out.println("Enter a number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		display(num);
		
	}
	public static void display(int i) {
		switch(i)
    	{
    	case 1:
    		System.out.println("Monday");
    		break;
    	case 2:
    		System.out.println("Tuesday");
    		break;
    	case 3:
    		System.out.println("Wednesday");
    		break;
    	case 4:
    		System.out.println("Thursday");
    		break;
    	case 5:
    		System.out.println("Friday");
    		break;
    	case 6:
    		System.out.println("Saturday");
    		break;
    	case 7:
    		System.out.println("Sunday");
    		break;
    	default:
    	    System.out.println("Wrong Choice");
    	    break;	
		
	}
 }
}
