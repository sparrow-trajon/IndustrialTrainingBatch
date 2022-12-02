package inheritance;

public class Cardiology extends Hospital{
	public static void main(String[] args) {
		Cardiology ep1 = new Cardiology();
		ep1.eName = "Sonal";
		ep1.emailId = "Suud@gmail.com";
		ep1.position ="Doctor";
		ep1.Timing =1200;
		ep1.salary = 250000;
		
		System.out.println(ep1.eName);
	}
}
