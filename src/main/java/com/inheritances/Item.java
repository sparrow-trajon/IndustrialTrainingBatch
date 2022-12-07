package com.inheritances;

public class Item {
private String name;
private double Totalprice;
private int qty; 
	

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getTotalprice() {
	return Totalprice;
}


public void setTotalprice(double totalprice) {
	Totalprice = totalprice;
}


public int getQty() {
	return qty;
}


public void setQty(int qty) {
	this.qty = qty;
}


public Item(String name,double Unitprice,int qty) {
	this.name= name;
	this .qty = qty;

	Totalprice = qty*Unitprice;
}
}

