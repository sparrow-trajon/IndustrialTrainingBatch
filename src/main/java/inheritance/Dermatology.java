package inheritance;

public class Dermatology extends Hospital{
	public static void main(String[] args) {
		Dermatology ep1 = new Dermatology();
		ep1.eName = "Snake";
		ep1.emailId = "Snakew@gmail.com";
		ep1.position ="Manager";
		ep1.Timing = 0730;
		ep1.salary = 250000;
		
		System.out.println(ep1.eName);
	}
}
