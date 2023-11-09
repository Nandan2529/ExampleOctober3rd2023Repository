package com.sgtesting.programs;

class Maths
{
	void add(int x,int y)
	{
		System.out.println("Addition result :"+(x+y));
	}
}
class Maths1 extends Maths
{
	void sub(int a,int b)
	{
		System.out.println("Sub result :"+(a-b));	
	}	
}
class Maths2 extends Maths1
{
	void mult(int c,int d)
	{
		System.out.println("Multiplication result :"+(c*d));
	}
}
class Maths4 extends Maths
{
	void div(int m,int n)
	{
		System.out.println("Div result :"+(m/n));
	}
}
public class ForLoop {
	public static void main(String[] args) {
		Maths2 o=new Maths2();
		o.add(30, 20);
		o.mult(10, 2);
        o.sub(40, 20);
        
        Maths4 o1=new Maths4();
        o.add(100, 200);
        o1.div(40, 2);
	}

}
