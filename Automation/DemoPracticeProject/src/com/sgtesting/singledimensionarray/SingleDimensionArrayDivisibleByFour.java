package com.sgtesting.singledimensionarray;

public class SingleDimensionArrayDivisibleByFour {

	public static void main(String[] args) {
		int count=0;
		for (int i=100;i>=50;i--)
		{
			if(i%4==0)
			{
				count++;
			}
		}
		System.out.println("# of Elements :"+count);

		//Declare an array
		int a[]=new int[count];

		//Assign divisible by four into an array	
		int k=0;
		for (int x=100;x>=50;x--)
		{
			if(x%4==0)
			{
				a[k]=x;
				k++;
			}
		}
		//Read elements
		for (int m=0;m<a.length;m++)
		{
			System.out.println(a[m]);
		}
	}
}
