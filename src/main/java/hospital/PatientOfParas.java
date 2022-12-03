package hospital;

public class PatientOfParas {
	public static void main(String[] args) {
		
		ParasHospital delhi = new ParasHospitalDelhi();
		delhi.ListOfDoctor();
		delhi.AdmitPatient();
		delhi.MedicoCunsultant();
//		delhi.DepartmentOfItAdmin();
		
		
		ParasHospitalPatna patna = new ParasHospitalPatna();
		patna.ListOfDoctor();
		
	}

}
