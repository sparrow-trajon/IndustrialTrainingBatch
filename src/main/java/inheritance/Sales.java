package inheritance;

public class Sales extends Company{
	public static void main(String[] args) {
		Marketing ep1 = new Marketing();
		ep1.eName = "Soni";
		ep1.emailId = "Soni3@gmail.com";
		ep1.position ="Senior Manager";
		ep1.remark ="Not Bad";
		ep1.salary = 2550000;
		
		System.out.println(ep1.eName);
	}
}
