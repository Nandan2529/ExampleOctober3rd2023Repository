package com.sgtesting.test;

class Demofa
{
	static void mod(int i,int j)
	{
		System.out.println("Modulus :"+(i/j));
	}
	
		void add(int a,int b)
		{
			System.out.println("Addition :"+(a+b));
		}
}
class Country
{
	Country(int CtyNo)
	{
		Demofa o=new Demofa();
		o.add(10, 20);
		Demofa.mod(2, 5);
		System.out.println("Cty no :"+CtyNo);
	}
}

public class Qa7 {
	public static void main(String[] args) {
		Country o=new Country(7);

	}

}
