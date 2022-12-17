package overrading;

public class ShubhamJourney extends Journey{
	public static void main(String[] args) {
		Journey j = new Journey();
		ShubhamJourney sh = new ShubhamJourney();
		SushantJourney su = new SushantJourney();
		ShamiJourney sa = new ShamiJourney();
		
		j.travelToMumbai();
		sh.travelToMumbai();
		su.travelToMumbai();
		sa.travelToMumbai();
	}
	
	public void travelToMumbai() {
		System.out.println("Traveling to Mumbai by train");
	}

}
