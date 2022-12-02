package inheritance;

public class HR extends Company{
	public static void main(String[] args) {
		Marketing ep1 = new Marketing();
		ep1.eName = "Sonal";
		ep1.emailId = "Suud@gmail.com";
		ep1.position ="Manager";
		ep1.remark ="Good";
		ep1.salary = 250000;
		
		System.out.println(ep1.eName);
	}
}
