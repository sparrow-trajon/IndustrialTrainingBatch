package assignment3;

import java.util.Scanner;

public class Balls {
	public static void main(String[] args) {
		
		calcBalls();
		
	}
public static void calcBalls() {
	System.out.println("Please Enter How Many Balls can be thrown in an Over");
	Scanner sc = new Scanner (System.in);
	int NoOfBalls= sc.nextInt();
	int ValidBalls =0;
	int ActualBall= 0;
	for (int i=1; i<=NoOfBalls && ValidBalls<6;i++ ) {
		 ActualBall++;
		System.out.println("Please Enter Speed Of "+ i+" Ball" );
	int SpeedOfBall= sc.nextInt();
	if (SpeedOfBall<150) {
		
		ValidBalls ++;
		//System.out.println(ValidBalls);
	}
		
	}
	
	if (ActualBall>=NoOfBalls) {
		System.out.println("Over Dismissed! Please change the Bolwer");
	}
	else {System.out.println("Over Will be completed in:- "+ActualBall+" Balls");}
}
}
