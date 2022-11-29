package com.bank;

public class SBIPiro extends SBIBank{

	@Override
	public boolean IsLockerAvailable() {
		 
		System.out.println("Yes we have Lockers Available");
		return true;
	}

}
