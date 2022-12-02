package inheritance;

public class Ophthalmology extends Hospital{
	public static void main(String[] args) {
		Ophthalmology ep1 = new Ophthalmology();
		ep1.eName = "Sonali Bala";
		ep1.emailId = "Suu32d@gmail.com";
		ep1.position ="Clerk";
		ep1.Timing = 0700;
		ep1.salary = 250000;
		
		System.out.println(ep1.eName);
	}
}
