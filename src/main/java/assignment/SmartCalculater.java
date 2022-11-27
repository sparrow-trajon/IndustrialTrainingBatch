package assignment;

import java.util.Scanner;

public class SmartCalculater {
	
	public static void main(String[] args) {
		
		
		Scanner usr = new Scanner(System.in);
		
		StartCalculator();
		
	}
	public static void StartCalculator() {
		System.out.println("1.	Start > it will start the calculator \r\n"
				+ "2.	Stop > it will stop the calculator \r\n"
				+ "3.	add num1 num2  = will add the numbers \r\n"
				+ "4.	sub num1 num2 = will subtract the numbers \r\n"
				+ "5.	mul num1 num2 = will multiply the numbers \r\n"
				+ "6.	div num1 num2 = will divide the numbers \r\n"
				+ "7.	mod num1 num2 = will get the modular division of num1 num2\r\n"
				+ "8.	per num1 num2 = will get the percentage\r\n"
				+ "");
		Scanner sc= new Scanner (System.in);
		String S1 = sc.nextLine();

		
		if (S1.equals("Start")) {
			
			
		while(true) {
				
				String S2 = sc.nextLine();
				if (S2.equals("Stop")) {
					
					break ;
					
				}
				String arr[] = S2.split(" ");
				
				int num1 = Integer.parseInt(arr[1]);
				int num2 = Integer.parseInt(arr[2]);
				
				switch   (arr[0]) {
				
				case  "add": {
				System.out.println(num1+num2);
				}
				break;
				
				
				case "sub" : {
				System.out.println(num1-num2);
				}
				break;
				
				case "mul" : {
					System.out.println(num1*num2);
					}
					break;
				case "div" : {
					System.out.println(num1/num2);
					}
					break;
				case "mod" : {
					System.out.println(num1%num2);
					}
					break;
					
				case "per" : {
					float f1 = num1;
					float f2 = num2;
					System.out.println((f1/f2)*100);
					}
					break;
					
					default : {System.out.println("Wrong input Sir!");
						
					}
				
				}
				
			}
			
		
		}
		else {System.out.println("Wrong Input! Please Type := 'Start' to start the calculator"); }
		
		}

		
		
		
	}


