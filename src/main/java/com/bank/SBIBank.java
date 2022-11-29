package com.bank;

public abstract class  SBIBank implements RBIguidLince{

	@Override
	public void saveMony(int amount) {
		
		System.out.println("your "+amount+"hase been saved");
		
	}

	@Override
	public int withdrowMony(int amount) {
		
		System.out.println(amount+ "hase been withdrawn!");
		return amount;
	}

	@Override
	public boolean openAccount(String aadharNumber, String PanNumber) {
		 
		System.out.println("Account IS created for aadhar number "+ aadharNumber+ "and Pan number"+PanNumber);
		return true;
	}

	@Override
	public boolean closeAccount() {
		 
		System.out.println("Account Is Closed");
		return true;
	}

	@Override
	public boolean verifyAccountn() {
		 
		System.out.println("Account Is verifyed");
		return true;
	}

	@Override
	public abstract boolean IsLockerAvailable(); 
		
}

	


