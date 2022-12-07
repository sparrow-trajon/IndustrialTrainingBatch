package com.inheritances;

public class Customer {
	public static void main(String[] args) {
		
		Item pen = new Item("ball pen", 12, 15);
		Item laptop= new Item("Dell", 2, 56200);
		Item mouse = new Item("HP", 11, 375);
		Item Mobile = new Item("Samsung", 1, 12570);
		Item SmartWatch = new Item("Noise", 6, 1999);
		Item Keybord = new Item("Dell", 7, 640);
		Item Ram = new Item("Sata", 2, 3299);
		Item Tab = new Item("Mi", 1,17990);
		Item Charger = new Item("samsung", 4, 766);
		Item Camra = new Item("sony", 1, 20433);
		
		ShoppingCart Item = new ShoppingCart();
		Item.addItem(Camra);
		Item.addItem(Charger);
		Item.addItem(Tab);
		Item.addItem(Ram);
		Item.addItem(Keybord);
		Item.addItem(SmartWatch);
		Item.addItem(Mobile);
		Item.addItem(mouse);
		Item.addItem(laptop);
		Item.addItem(pen);
		
		
		
		System.out.println(Item.calculateTotalPrice());
		System.out.println(Item);
		

		
	}

}
