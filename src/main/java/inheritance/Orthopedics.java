package inheritance;

public class Orthopedics extends Hospital{
	public static void main(String[] args) {
		Orthopedics ep1 = new Orthopedics();
		ep1.eName = "Shadim";
		ep1.emailId = "Shadim@gmail.com";
		ep1.position ="Junior Doctor";
		ep1.Timing = 0100;
		ep1.salary = 20000;
		
		System.out.println(ep1.eName);
	}
}
