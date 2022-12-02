package inheritance;

public class Sellers extends Amazon{
	public static void main(String[] args) {
		Sellers s12 = new Sellers();
		s12.eName = "sushant";
		s12.emailId = "Sushant12@gmail.com";
		s12.phoneNo = 987989879;
		
		System.out.println(s12.eName);
	}
}
