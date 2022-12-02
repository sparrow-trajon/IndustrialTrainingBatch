package inheritance;

public class Transport extends School {
	String Route;
	String DriverName;
	public static void main(String[] args) {
		Transport bus1 = new Transport();
		bus1.registrationNo = 001;
		bus1.address = "bus1@gmail.com";
		bus1.DriverName = "Ram lal";
		bus1.Route = "NH 10";
		
		System.out.println(bus1.DriverName);
	}

}
