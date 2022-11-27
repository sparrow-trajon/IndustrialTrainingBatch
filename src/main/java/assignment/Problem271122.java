package assignment;

public class Problem271122 {
	public static void main(String[] args) {
		
	
	int thief=400;
	int policeman=0;
	int count = 0;
	getstep(thief,policeman,count);
	}
	public static void getstep(int thief,int policeman,int count) {
		
		while(thief > policeman) {
//			thief--;
			policeman +=2;
			count++;
			
		}
		System.out.println("After "+count+" steps,the policeman will be able to catch the thief");
		
		
	}

}
