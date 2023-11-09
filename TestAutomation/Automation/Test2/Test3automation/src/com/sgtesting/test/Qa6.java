package com.sgtesting.test;

class Demox
{
	{
		System.out.println("Instance Block");
	}
	int CtyNo;
	String ContinentName;
	
	Demox ()
	{
		System.out.println("COUNTRY DETAILS:");
		System.out.println("------------------------");
		CtyNo = 1;
		System.out.println("Continent Number: "+CtyNo);
		ContinentName = "Asia";
		System.out.println("Continent Name: "+ContinentName);
		
		System.out.println("************************");
	}
	static
	{
		System.out.println("Static Block");
	}
}
public class Qa6 {

	public static void main(String[] args) {
		Demox o=new Demox();

	}

}
