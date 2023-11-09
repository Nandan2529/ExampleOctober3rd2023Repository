package com.sgtesting.singledimensionarray;

public class SingleDimensionArrayDivisibleByNine {

	public static void main(String[] args) {
		int count=0;
		for(int i=200;i>=100;i--)
		{
			if (i%9==0)
			{
				count++;
			}
		}
		System.out.println("# of Elements :"+count);

		//Declare an array
		int a[]=new int[count];

		//Assign divisible nine an array
		int k=0;
		for (int j=200;j>=100;j--)
		{
			if (j%9==0)
			{
				a[k]=j;
				k++;
			}
		}
		//Read the elements
		for (int n=a.length/2;n<a.length;n++)
		{
			System.out.println(a[n]);
		}

	}

}
