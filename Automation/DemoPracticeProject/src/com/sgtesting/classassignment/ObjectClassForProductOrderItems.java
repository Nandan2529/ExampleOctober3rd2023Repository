package com.sgtesting.classassignment;

class Product
{
	int PrdID;
	String PrdName;
	String PrdType;
	int PrdAmt;
}

class Order
{
	int OdrNo;
	String OdrName;
	int OdrAmt;
	int OdrQuantity;
}

class Item
{
	int ItmNo;
	String ItmName;
	String ItmType;
	int ItmAmt;
}

public class ObjectClassForProductOrderItems {

	public static void main(String[] args) {
		// Object class For Product Order Item
		Product obj1 = new Product();
		
		obj1.PrdID = 604;
		System.out.println("Product ID: "+obj1.PrdID);
		obj1.PrdName = "Dimond Ring";
		System.out.println("Product Name: "+obj1.PrdName);
		obj1.PrdType = "Jewellary";
		System.out.println("Product Type: "+obj1.PrdType);
		obj1.PrdAmt = 30000;
		System.out.println("Product Amount: "+obj1.PrdAmt);
		System.out.println("************************");
		
		Order obj2 = new Order();
		
		obj2.OdrNo = 214;
		System.out.println("Order No: "+obj2.OdrNo);
		obj2.OdrName = "Apple Watch";
		System.out.println("Order Name: "+obj2.OdrName);
		obj2.OdrAmt = 1500;
		System.out.println("Order Amount: "+obj2.OdrAmt);
		obj2.OdrQuantity = 20;
		System.out.println("Order Quantity: "+obj2.OdrQuantity);
		System.out.println("************************");
		
		Item obj3 = new Item();
		
		obj3.ItmNo = 114;
		System.out.println("Item No: "+obj3.ItmNo);
		obj3.ItmName = "Realme TV";
		System.out.println("Item Name: "+obj3.ItmName);
		obj3.ItmType = "Electronics";
		System.out.println("Item Type: "+obj3.ItmType);
		obj3.ItmAmt = 2800;
		System.out.println("Item Amount: "+obj3.ItmAmt);
		System.out.println("************************");
	}
}
