package com.bank;

public class CustomerBanking {
	public static void main(String[] args) {
		
		SBIBhojpur bhojpur = new SBIBhojpur();
		System.out.println(bhojpur.openAccount("77101499", "KEJPS"));
		bhojpur.saveMony(503738);
	System.out.println(bhojpur.IsLockerAvailable());
	
	SBIPiro piro = new SBIPiro();
	System.out.println(piro.openAccount("6827659475", "ki3h2j"));
	piro.saveMony(24925703);
	System.out.println(piro.IsLockerAvailable());
			
		
		
		
	}

}
