package com.bank;

public class SBIBhojpur extends SBIBank {

	@Override
	public boolean IsLockerAvailable() {
		System.out.println("No Locker Is Available ! Kindly Contact The Main Branch In Patna");
		 
		return false;
	}

}
