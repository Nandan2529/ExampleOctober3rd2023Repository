package com.sgtesting.test;

class Demoe
{
	{
		System.out.println("Instance block no1");
	}
	void div(int a,int b)
	{
		System.out.println("Division :"+(a/b));
	}
}
class Demof
{
	static void mod(int i,int j)
	{
		Demoe o=new Demoe();
		o.div(10, 2);
		System.out.println("Modulus :"+(i/j));
	}
}
public class Qa4 {
	public static void main(String[] args) {
		Demof.mod(2, 5);
		

	}

}
