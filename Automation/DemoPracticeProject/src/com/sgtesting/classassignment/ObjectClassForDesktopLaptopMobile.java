package com.sgtesting.classassignment;

class Desktop
{
	int DetpID;
	String MfrName;
	String DetpType;
	int DetpPrice;
}

class Laptop
{
	int LapID;
	String MfrName;
	String Madein;
	int LapPrice;
}

class Mobile
{
	int MblNo;
	String MfrName;
	int MfrYear;
	int MblPrice;
}

public class ObjectClassForDesktopLaptopMobile {

	public static void main(String[] args) {
		// Object Class For Desktop Laptop Mobile
		Desktop obj1 = new Desktop();
		
		obj1.DetpID = 114;
		System.out.println("Desktop ID: "+obj1.DetpID);
		obj1.MfrName = "MSI";
		System.out.println("Desktop Name: "+obj1.MfrName);
		obj1.DetpType = "Home";
		System.out.println("Desktop Type: "+obj1.DetpType);
		obj1.DetpPrice = 35000;
		System.out.println("Desktop Price: "+obj1.DetpPrice);
		System.out.println("************************");
		
		Laptop obj2 = new Laptop();
		
		obj2.LapID = 124;
		System.out.println("Laptop ID: "+obj2.LapID);
		obj2.MfrName = "Dell";
		System.out.println("Manufactured Name: "+obj2.MfrName);
		obj2.Madein = "India";
		System.out.println("Made in: "+obj2.Madein);
		obj2.LapPrice = 40000;
		System.out.println("Laptop Price: "+obj2.LapPrice);
		System.out.println("************************");
		
		Mobile obj3 = new Mobile();
		
		obj3.MblNo = 952137622;
		System.out.println("Mobile No: "+obj3.MblNo);
		obj3.MfrName = "IPhone";
		System.out.println("Manufactured Name: "+obj3.MfrName);
		obj3.MfrYear = 2020;
		System.out.println("Manufactured Year: "+obj3.MfrYear);
		obj3.MblPrice = 49000;
		System.out.println("Mobile Price: "+obj3.MblPrice);
		System.out.println("************************");
	}
}