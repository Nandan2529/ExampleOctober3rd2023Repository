package com.sgtesting.test;

class Demoa
{
	{
		System.out.println("Instance block no1");
	}
	static
	{
		System.out.println("static block no1");
	}
}
class Addition
{
	void add(int a,int b)
	{
		Demoa o=new Demoa();
		System.out.println("Addition :"+(a+b));
	}
}
public class Qa3 {
	public static void main(String[] args) {
		Addition o=new Addition();
		o.add(20,10);
	}

}
