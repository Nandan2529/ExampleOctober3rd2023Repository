package com.sgtesting.constructoroverloading;

class Examination
{
	Examination(String examcenter)
	{
		System.out.println("Examination Centre :"+examcenter);
	}
	Examination(Double examfees)
	{
		System.out.println("Examination Fees :"+examfees);
	}
	Examination(String address,int pincode)
	{
		System.out.println("Address :"+address);
		System.out.println("Pincode :"+pincode);
	}
	
	
}
public class ExaminationDemo {
	public static void main(String[] args) {
		Examination o1=new Examination("Dudda");
		Examination o2=new Examination(670.50);
		Examination o3=new Examination("Dudda",543289);

	}

}
