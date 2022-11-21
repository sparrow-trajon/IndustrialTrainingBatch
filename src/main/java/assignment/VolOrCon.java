package assignment;

import java.util.Scanner;

public class VolOrCon {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a charater:- ");
	char c = sc.next().charAt(0);
	sc.close();
	volOrCon(c);
	}

	public static void volOrCon(char c) {
		if(c=='a') {
			System.out.println("It is a vowel");
		}
		else if(c=='e') {
			System.out.println("It is a vowel");
		}
		else if(c=='i') {
			System.out.println("It is a vowel");
		}
		else if(c=='o') {
			System.out.println("It is a vowel");
		}
		else if(c=='u') {
			System.out.println("It is a vowel");
		}
		else {
			System.out.println("It is not a vowel");
		}
	}
}
