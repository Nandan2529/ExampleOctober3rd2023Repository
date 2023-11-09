package com.sgtesting.twodimensionarrayassignment;

public class IntegerTransposeTwoDimensionArray {

	public static void main(String[] args) {
		int a[][]= {{5,10,15},{20,25,30},{35,40,45}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}

}
