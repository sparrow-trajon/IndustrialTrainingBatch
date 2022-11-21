package assignment;

import java.util.Scanner;

public class GreaterNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements:- ");
		int n = sc.nextInt();
		int[] array = new int[10];
		System.out.println("Enter the numbers:- ");
		for(int i =0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		greaterNum(array);
	}


public static void greaterNum(int[] a) {
	int max = a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max = a[i];
		}
	}
		System.out.println("The minimum value is "+max);
 }
}