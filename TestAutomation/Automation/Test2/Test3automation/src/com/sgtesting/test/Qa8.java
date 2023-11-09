package com.sgtesting.test;

class Demofa1
{
	static void mod(int i,int j)
	{
		System.out.println("Modulus :"+(i/j));
	}
	static void add(int a,int b)
	{
		System.out.println("Addition :"+(a+b));
	}
}
class Demoxa
{
	int CtyNo;
	Demoxa ()
	{
		Demofa1.add(10, 10);
		Demofa1.mod(2, 5);
		CtyNo = 1;
		System.out.println("Continent Number: "+CtyNo);
	}
}
public class Qa8 {
	public static void main(String[] args) {
		Demoxa o=new Demoxa();

	}

}
