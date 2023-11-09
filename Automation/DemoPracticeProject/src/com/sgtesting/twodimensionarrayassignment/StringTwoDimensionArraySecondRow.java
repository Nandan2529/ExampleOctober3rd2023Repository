package com.sgtesting.twodimensionarrayassignment;

public class StringTwoDimensionArraySecondRow {

	public static void main(String[] args) {
		String a[][]= {{"Nandan","Ashok","Gajanan"},{"Prajwal","Chandan","Karthik"},{"Hemanth","Bharath","Santosh"}};
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[1][i]+" ");
		}
	}
}
