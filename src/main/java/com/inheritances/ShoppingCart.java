package com.inheritances;

public class ShoppingCart {

	private Item[]cartItems;
	private double TotalPrice;
	private int StoreItem;
	public ShoppingCart() {
		cartItems = new Item[10];
		
	}
	public ShoppingCart(int CartSize) {
		cartItems = new Item[CartSize];
	}
	public void addItem(Item input) {
		if(StoreItem <cartItems.length) {
			cartItems[StoreItem] = input;
			StoreItem++;
		}
		else {
			System.out.println("Cart Is Full ");
		}
	}
	public double calculateTotalPrice() {
		for(int i=0;i<cartItems.length;i++) {
			TotalPrice +=cartItems[i].getTotalprice(); 
		}
		return TotalPrice;
	}
}
