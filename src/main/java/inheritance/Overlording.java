package inheritance;

public class Overlording {
	public static void main(String[] args) {
		display("Sushant",20);
	}
	
	public static void display() {
		System.out.println("Method 1");
		System.out.println("Hi");
	}
	
	public static void display(String a) {
		System.out.println("Method 2");
		System.out.println("Hi, "+a);
	}
	
	public static void display(String a, int b) {
		System.out.println("Method 3");
		System.out.println("Hi, "+a+" of age "+b);
	}

}
