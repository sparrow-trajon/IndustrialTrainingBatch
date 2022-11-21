package assignment;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:- ");
		int num = sc.nextInt();
		sc.close();
		leapYear(num);
	}

	public static void leapYear(int num) {
		if((num%4==0)&&(num%100!=0)||(num%400==0)) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}
		
	}

}
