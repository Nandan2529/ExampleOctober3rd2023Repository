package com.sgtesting.parametarisedconstructor;

class Product
{
	int PrdID;
	String PrdName;
	String PrdType;
	int PrdAmt;
	Product (int PrdID,String PrdName,String PrdType,int PrdAmt)
	{
		System.out.println("PRODUCT DETAILS:");
		System.out.println("------------------------");
		PrdID = PrdID;
		System.out.println("Product ID: "+PrdID);
		PrdName = PrdName;
		System.out.println("Product Name: "+PrdName);
		PrdType = PrdType;
		System.out.println("Product Type: "+PrdType);
		PrdAmt = PrdAmt;
		System.out.println("Product Amount: "+PrdAmt);
		System.out.println("************************");	
	}
}

class Order
{
	int OdrNo;
	String OdrName;
	int OdrAmt;
	int OdrQuantity;
	Order (int OdrNo,String OdrName,int OdrAmt,int OdrQuantity)
	{
		System.out.println("ORDER DETAILS:");
		System.out.println("------------------------");
		OdrNo = OdrNo;
		System.out.println("Order No: "+OdrNo);
		OdrName = OdrName;
		System.out.println("Order Name: "+OdrName);
		OdrAmt = OdrAmt;
		System.out.println("Order Amount: "+OdrAmt);
		OdrQuantity = OdrQuantity;
		System.out.println("Order Quantity: "+OdrQuantity);
		System.out.println("************************");	
	}
}

class Item
{
	int ItmNo;
	String ItmName;
	String ItmType;
	int ItmAmt;
	Item (int ItmNo,String ItmName,String ItmType,int ItmAmt)
	{
		System.out.println("ITEM DETAILS:");
		System.out.println("------------------------");
		ItmNo = ItmNo;
		System.out.println("Item No: "+ItmNo);
		ItmName = ItmName;
		System.out.println("Item Name: "+ItmName);
		ItmType = ItmType;
		System.out.println("Item Type: "+ItmType);
		ItmAmt = ItmAmt;
		System.out.println("Item Amount: "+ItmAmt);
		System.out.println("************************");	
	}
}

public class ObjectClassForProductOrderItems {

	public static void main(String[] args) {
		// Object class For Product Order Item
		Product obj1 = new Product(01,"Mouse","Elctronics",250);

		Order obj2 = new Order(11,"Sony TV",25000,20);

		Item obj3 = new Item(10,"Samsung TV","Electronics",57000);

	}
}
