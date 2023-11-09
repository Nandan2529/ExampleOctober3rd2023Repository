package www.sgtesting.exception;

class Maths
{
	static void addition(int a,int b)
	{
		System.out.println("add :"+(a+b));
	}
	static void Substraction(int a,int b)
	{
		System.out.println("Sub:"+(a-b));
	}
	static void Mult(int a,int b)
	{
		System.out.println("Mult:"+(a*b));
	}
	static void Div(int a,int b)
	{
		try
		{
			
		System.out.println("Div :"+(a/b));
		} catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally this block excuite always");
		}
		
	}
	static void evenNum(int a)
	{
		if(a%2==0)
		{
			System.out.println(a+" Is a even number");
		}
	}
	static void oddNum(int a)
	{
		if(a%2==1)
		{
			System.out.println(a+" Is a odd number");
		}
	}
	static void average(int a,int b)
	{
		System.out.println("average :"+(a+b)/2);
	}

}
public class HandlingException {
	public static void main(String[] args) {
		Maths.addition(10, 20);
		Maths.Substraction(20, 15);
		Maths.Mult(2, 10);
		Maths.Div(25, 0);
		Maths.oddNum(21);
		Maths.evenNum(24);
		Maths.average(1, 10);
	}

}
