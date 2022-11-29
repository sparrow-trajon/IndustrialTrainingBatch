package com.bank;

public interface RBIguidLince {

	
	void saveMony(int amount);
	int withdrowMony(int amount);
	boolean openAccount(String aadharNumber,String PanNumber);
	boolean closeAccount();
	boolean verifyAccountn();
	boolean IsLockerAvailable();
	
}
