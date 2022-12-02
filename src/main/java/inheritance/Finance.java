package inheritance;

public class Finance extends Company{
	public static void main(String[] args) {
		Marketing ep1 = new Marketing();
		ep1.eName = "Tanu";
		ep1.emailId = "Tanu3hd@gmail.com";
		ep1.position ="Clerk";
		ep1.remark ="Normal";
		ep1.salary = 2230000;
		
		System.out.println(ep1.eName);
	}
}
