package com.sgtesting.twodimensionarrayassignment;

public class ShortTwoDimensionArrayLastRow {

	public static void main(String[] args) {
		short a[][]= {{10,20,30},{40,50,60,},{70,80,90}};
		for (int i=a.length-1;i<a.length;i++) 
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
