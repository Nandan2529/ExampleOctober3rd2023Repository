package com.sgtesting.constructoroverloading;

class University
{
	University(String Uname)
	{
		System.out.println("University Name:"+Uname);
	}
	University(double tuitionfees)
	{
		System.out.println("Tuition fees :"+tuitionfees);
	}
	University(String address,int pincode)
	{
		System.out.println("Address :"+address);
		System.out.println("pincode:"+pincode);
	}
}
public class UniversityDemo {

	public static void main(String[] args) {
		University o1=new University("VTU");
		University o2=new University(75000.25);
		University o3=new University("Belgam"+573201);

	}

}
