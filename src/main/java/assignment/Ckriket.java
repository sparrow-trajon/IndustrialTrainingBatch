package assignment;

import java.util.Scanner;

public class Ckriket {

	public static void main(String[] args) {
		
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the how many balls can be Thrown in a over ");
		int NOB = sc.nextInt(); 
		
		int VBalls = 0;
		int ABall = 0;
		getBall(NOB,VBalls,ABall, sc);
	}
	public static void getBall(int NOB,int VBalls,int ABall, Scanner sc) {
		
		for(int i=1;i<=NOB && VBalls<6;i++ ) {
			ABall ++;
			System.out.println("Please Enter Speed Of "+ i+" Ball" );
			int SpeedOfBall = sc .nextInt();
		
			
			if(SpeedOfBall>=150) {
				VBalls++;
			}
			else {
				VBalls=0;
			}
		}
		
		if(ABall>=NOB) {
			System.out.println("OVER  Has Completed");
		}
		else {
			System.out.println("OVER Would be completed after"+ABall+"balls");
		}
		
		
		
	}
}
