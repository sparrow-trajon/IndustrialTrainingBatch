package inheritance;

public class Teachers extends School {
	int salary;
	public static void main(String[] args) {
		Teachers A1 = new Teachers();
		A1.fName = "Sunny Singh";
		A1.gender = "Male";
		A1.address = "Mumbai";
		A1.emailId = "Sunny12@gmail.com";
		A1.salary = 30000;
		
		System.out.println(A1.salary);
	}

}
