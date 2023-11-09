package com.sgtesting.arrays;

public class StringTwoDimensionArray {

	public static void main(String[] args) {
		String a[][]= {{"Nandan","Ashok","Gajanan"},{"Prajwal","Rohit","Chandan"},{"Praveen","Ram","Raju"}};
		for (int i=0;i<a.length/2;i++)
		{
			for (int j=0;j<a[i].length/2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}	

}
