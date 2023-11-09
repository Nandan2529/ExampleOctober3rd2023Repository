package com.sgtesting.test;
class Demom
{
	static
	{
		System.out.println("static block no1");
	}
	static void mod(int i,int j)
	{
		System.out.println("Modulus :"+(i/j));
	}
}
class Demon
{
	{
		Demom.mod(2, 5);
		System.out.println("Instance Block");
	}
}
public class Qa5 {
	public static void main(String[] args) {
		Demon o=new Demon();
	}

}
