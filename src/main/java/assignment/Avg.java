package assignment;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] array = new int[10];
		System.out.println("Enter the numbers:- ");
		for(int i =0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		avgNum(array);
	}

	public static void avgNum(int[] a) {
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++) {
			 sum = sum + a[i];
			 avg = sum/a.length;
		}
		System.out.print("avg is :"+avg);
		
	}

}
