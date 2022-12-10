package inheritance;

public class Pencil extends Writing_Instument {
	Gyf_Lead g = new Gyf_Lead();
	public static void main(String[] args) {
		Pencil p = new Pencil();
		p.big = "True";
		p.lead = "Gryfit";
		p.used = "Yes";
		 
		System.out.println(p.big);
	}       

}
