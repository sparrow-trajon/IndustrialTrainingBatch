package assignment;

import java.util.Scanner;

public class FuzzBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		sc.close();
		fuzzBuzz(num);
	}

	public static void fuzzBuzz(int num) {
		if(num%6==0) {
			System.out.println("FuzzBuzz");
		}
		else if(num%3==0) {
			System.out.println("Fuzz");
		}
		else if(num%2==0) {
			System.out.println("Buzz");
		}
		else{
			System.out.println("Its not divisible by 2,3,6");
		}
	}

}
