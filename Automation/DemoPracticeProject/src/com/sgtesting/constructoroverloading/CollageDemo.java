package com.sgtesting.constructoroverloading;

class Collage
{
	Collage(String Cname)
	{
		System.out.println("Collage Name :"+Cname);
	}
	Collage(Double Clgfee)
	{
		System.out.println("Collage fees :"+Clgfee);
	}
	Collage(String address,int pincode)
	{
		System.out.println("Address :"+address);
		System.out.println("Pincode :"+pincode);
	}
}
public class CollageDemo {
	public static void main(String[] args) {
	Collage o1=new Collage("Rajev Institute of Technology");
	Collage o2=new Collage(58700.25);
	Collage o3=new Collage("Hassan",532701);

	}

}
