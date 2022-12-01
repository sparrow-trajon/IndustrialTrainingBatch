package assignment;

public class Student extends SchoolMember {

	int rollNo;
	int std;
	
	public static void main(String[] args) {
		Student stu= new Student();
		stu.address="Faridabad";
		
		System.out.println(stu.address);
	}
}
