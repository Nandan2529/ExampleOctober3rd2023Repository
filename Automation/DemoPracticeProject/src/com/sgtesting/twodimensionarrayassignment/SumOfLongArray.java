package com.sgtesting.twodimensionarrayassignment;

public class SumOfLongArray {

	public static void main(String[] args) {
		int sum=0;
		long a[][]= {{10,15,20},{25,30,35},{40,45,50}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				sum+=a[i][j];
			}
		}
		System.out.print(sum);

	}

}
