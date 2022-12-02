package inheritance;

public class Student extends School {
	int rollNo;
	int std;
	public static void main(String[] args) {
		Student Ravi = new Student();
		Student Tanu = new Student();
		Ravi.fName = "Ravi Kumar";
		Ravi.address = "Delhi";
		Ravi.emailId = "Ravi@gmail.com";
		Ravi.gender = "Male";
		Ravi.phoneNo = 486329898;
		Ravi.registrationNo = 534535435;
		Tanu.rollNo = 74;
		Tanu.std = 10;
		
		System.out.println(Tanu.std);
	}

}
