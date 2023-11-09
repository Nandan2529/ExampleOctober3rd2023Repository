package com.sgtesting.parametarisedconstructor;

class Desktop
{
	int DetpID;
	String MfrName;
	String DetpType;
	int DetpPrice;
	Desktop (int DetpID,String MfrName,String DetpType,int DetpPrice)
	{
		System.out.println("DESKTOP DETAILS:");
		System.out.println("------------------------");
		DetpID = DetpID;
		System.out.println("Desktop ID: "+DetpID);
		MfrName = MfrName;
		System.out.println("Desktop Name: "+MfrName);
		DetpType = DetpType;
		System.out.println("Desktop Type: "+DetpType);
		DetpPrice = DetpPrice;
		System.out.println("Desktop Price: "+DetpPrice);
		System.out.println("************************");	
	}
}

class Laptop
{
	int LapID;
	String MfrName;
	String Madein;
	int LapPrice;
	Laptop (int LapID,String MfrName,String Madein,int LapPrice)
	{
		System.out.println("LAPTOP DETAILS:");
		System.out.println("------------------------");
		LapID = LapID;
		System.out.println("Laptop ID: "+LapID);
		MfrName = MfrName;
		System.out.println("Manufactured Name: "+MfrName);
		Madein = Madein;
		System.out.println("Made in: "+Madein);
		LapPrice = LapPrice;
		System.out.println("Laptop Price: "+LapPrice);
		System.out.println("************************");	
	}
}

class Mobile
{
	int MblNo;
	String MfrName;
	int MfrYear;
	int MblPrice;
	Mobile (int MblNo,String MfrName,int MfrYear,int MblPrice)
	{
		System.out.println("MOBILE DETAILS:");
		System.out.println("------------------------");
		MblNo = MblNo;
		System.out.println("Mobile No: "+MblNo);
		MfrName = MfrName;
		System.out.println("Manufactured Name: "+MfrName);
		MfrYear = MfrYear;
		System.out.println("Manufactured Year: "+MfrYear);
		MblPrice = MblPrice;
		System.out.println("Mobile Price: "+MblPrice);
		System.out.println("************************");	
	}
}

public class ObjectClassForDesktopLaptopMobile {

	public static void main(String[] args) {
		// Object Class For Desktop Laptop Mobile
		Desktop obj1 = new Desktop(111,"HP","Home",25000);
		
		Laptop obj2 = new Laptop(121,"Lenovo","Japan",25000);
	
		Mobile obj3 = new Mobile(952158622,"Lenovo",2018,25000);
		
	}
}