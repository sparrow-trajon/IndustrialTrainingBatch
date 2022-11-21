package assignment;

import java.util.Scanner;

public class Assignment_21Nov {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Program 1 : checking given number is positice or not : Test Case;
//		int num =-5;
//		System.out.println(findPostiveOrNegative(num));
//		num = 5;
//		System.out.println(findPostiveOrNegative(num));
		
//		Program 2 : printing greatest number -- Test Case	
//		int n = 5;
//		int arr[] = new int[5];
//		for(int i=0;i<arr.length;i++)	arr[i] = sc.nextInt();
//		System.out.println(maxElement(arr));
		
		
//		Program 3 : Print Month Name
//		int monthCode = sc.nextInt();
//		if(monthCode>0 && monthCode<=12) {
//			displayMonth(monthCode);
//		}
//		else
//			System.out.println("Out of range.");
		
//		Program 4 : Check Vowel Or Consonants
//		char c = sc.next().charAt(0);
//		String ans = isVowel(c) ? "Vowel" : "Consonants";
//		System.out.println(ans);
		
//		Program 5 : Check Leap year
//		int year = sc.nextInt();
//		String ans = isLeap(year) ? "Leap Year" : "Not a leap year";
//		System.out.println(ans);
		
		
//		Program 6 : Print Average of 5 numbers
//		int arr[] = new int[5];
//		for(int i=0;i<arr.length;i++)	arr[i] = sc.nextInt();
//		 printAverage(arr);
		
		
//		Program 7 : Check multiple of 2 and 3
	    int num = sc.nextInt();
	    printFizzBuzz(num);
		
//		Program 8 : Print Days Name
		int dayCode = sc.nextInt();
		if(dayCode>0 && dayCode<=12) {
			displayDay(dayCode);
		}
		else
			System.out.println("Entered Number is out of range.");	
	    
}
	
	
	
private static void printFizzBuzz(int num) {
		if(num%2 == 0) {
			if(num%3==0) {
				System.out.println("FizzBuzz");
			}
			else System.out.println("Fizz");
		}
		else if(num%3 == 0) System.out.println("Buzz");
		
}



private static void printAverage(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum += i;
		System.out.println(sum/arr.length);
		
	}

private static boolean isLeap(int year) {
		return year%4 == 0 ;
	}

//	Method for checking given number is positive or not
	public static String findPostiveOrNegative(int n) {
		String ans = (n>=0) ? "positive" : "Negative";
		return ans;
	}
	
//	Method for printing greatest number
	public static int maxElement(int arr[]) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			max = (max<arr[i]) ? arr[i] : max ;
		}
		return max;
	}
	
	public static void displayMonth(int i) {
		switch(i) {
		case 1 :
			System.out.println("January");
			break;
		case 2 :
			System.out.println("February");
			break;
		case 3 :
			System.out.println("March");
			break;
		case 4 :
			System.out.println("April");
			break;
		case 5 :
			System.out.println("May");
			break;
		case 6 :
			System.out.println("June");
			break;
		case 7 :
			System.out.println("July");
			break;
		case 8 :
			System.out.println("August");
			break;
		case 9 :
			System.out.println("September");
			break;
		case 10 :
			System.out.println("October");
			break;
		case 11 :
			System.out.println("November");
			break;
		case 12 :
			System.out.println("December");
			break;
		default:
			System.out.println("Not a valid option.");
		}
		
	}
	
//	Method for showing week day name
	public static void displayDay(int i) {
		switch(i) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
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
		default:
			System.out.println("Not a valid option.");
		}
		
	}

	
	
//	Method for checking vowel or constant
	public static boolean isVowel(char c) {
		char arr[] = new char[] {'a','e','i','o','u','A','E','I','O','U'};

		for(int i=0;i<arr.length;i++) {
			if(arr[i] == c) return true;
		}
		return false;
				
	}
	
	

}
