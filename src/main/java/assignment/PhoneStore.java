package assignment;

//Assignment 22 November
interface Phone{
	String MANUFACTURER = "INDIA";
	
	void brandName();
	void OS();
	void battery();
	void display();
}

 class SamsungPhone implements Phone{

	 public void brandName() {
		 	System.out.println("Welcome to Samsung World");
			System.out.println("-------------------");
			
		}

		public void OS() {
			System.out.println("OS is : Android");
		}

		public void display() {
			System.out.println("We have LCD panel display.");
		}
		
		public void battery() {
			System.out.println("Battery is 4500 mAh");
		}
	
	SamsungPhone(){
		this.brandName();
		this.OS();
		this.display();
		this.battery();
		System.out.println("Manufacturer : "+this.MANUFACTURER+"\n\n");
	}
}

 class NokiaPhone implements Phone{
	 
	NokiaPhone(){
		this.brandName();
		this.OS();
		this.display();
		this.battery();
		System.out.println("Manufacturer : "+this.MANUFACTURER+"\n\n");
	}

	public void brandName() {
		System.out.println("Welcome to Nokia World");
		System.out.println("-------------------");
		
	}

	public void OS() {
		System.out.println("OS is : Symbian");
	}

	public void display() {
		System.out.println("We have Super Amolded  display.");
	}
	
	public void battery() {
		System.out.println("Battery is 5000 mAh");
	}
}
public class PhoneStore {
	public static void main(String[] args) {
		SamsungPhone m10 = new SamsungPhone();
		NokiaPhone nokia5 = new NokiaPhone();

	}
}