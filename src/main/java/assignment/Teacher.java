package assignment;

public class Teacher extends SchoolMember{
	
private String empId;

public static void main(String[] args) {
	Teacher teacher= new Teacher();
	teacher.emailId="teacher@abc.com";
	
	System.out.println(teacher.emailId);
}
}
