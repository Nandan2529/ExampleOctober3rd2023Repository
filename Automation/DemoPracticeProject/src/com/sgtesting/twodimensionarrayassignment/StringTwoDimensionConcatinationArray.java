package com.sgtesting.twodimensionarrayassignment;

public class StringTwoDimensionConcatinationArray {

	public static void main(String[] args) {
		String b=" ";
		String a[][]= {{"ONE","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine"}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				b=b+a[i][j];
			}
		}
		System.out.println(b);
	}

}
