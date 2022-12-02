package inheritance;

public class MainDept extends Amazon{
	public static void main(String[] args) {
	MainDept e3 = new MainDept();
	e3.eName = "Goku";
	e3.phoneNo = 914225553;
	e3.emailId = "Goku7@gmail.com";
	e3.position = "Manager";
	e3.salary = 23000000;
	
	System.out.println(e3.salary);
	}
}
