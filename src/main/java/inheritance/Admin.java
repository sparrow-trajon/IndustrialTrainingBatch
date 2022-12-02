package inheritance;

public class Admin extends School {
	int income;
	public static void main(String[] args) {
		Admin principal = new Admin();
		principal.fName = "Deepika Rana";
		principal.gender = "Female";
		principal.income = 500000000;
		principal.phoneNo = 984573986;
		
		System.out.println(principal.fName);
	}

}
