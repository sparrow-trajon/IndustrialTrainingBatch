package assignment;

import java.util.Scanner;

public class PosOrNeg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		sc.close();
		posOrNeg(num);
	}

	public static void posOrNeg(int num) {
		if(num>0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
	}

}
