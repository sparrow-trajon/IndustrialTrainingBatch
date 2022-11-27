package assignment3;

import java.util.Scanner;

public class CalSteps {
public static void main(String[] args) {
	System.out.println("please enter thief old steps:-");
	Scanner sc = new Scanner (System.in);
	int inputSteps = sc.nextInt(); 
	mtdCalSteps(inputSteps);
}


public static void mtdCalSteps(int ThiefOldSteps ) {
	
	System.out.println("Police Reqired Steps:=  "+2*ThiefOldSteps);
	////////y+x = 2x///////x is police Steps y is thief old steps////
	
	
}
}

