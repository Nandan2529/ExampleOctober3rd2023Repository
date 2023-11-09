package com.sgtesting.twodimensionarrayassignment;

public class DoubleTwoDimensionArray {

	public static void main(String[] args) {
		double a[][]= {{10.2,15.2,18.5},{17.5,12.8,19.5},{22.5,31.5,36.4}};
		for (int i=a.length-1;i>=0;i--)
		{
			for (int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" "); 
			}
			System.out.println();
		}

	}

}
