package inheritance;

public class Buyers extends Amazon{
	public static void main(String[] args) {
		Buyers b32 = new Buyers();
		b32.eName = "Sanji";
		b32.emailId = "Sanjicook@gmail.com";
		b32.phoneNo = 89563494;
		
		System.out.println(b32.eName);
	}
}
