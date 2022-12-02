package inheritance;

public class Marketing extends Company{
	public static void main(String[] args) {
		Marketing ep1 = new Marketing();
		ep1.eName = "Sunny";
		ep1.emailId = "Suu3hd@gmail.com";
		ep1.position ="Junior Manager";
		ep1.remark ="Not Bad";
		ep1.salary = 20000;
		
		System.out.println(ep1.eName);
	}

}
