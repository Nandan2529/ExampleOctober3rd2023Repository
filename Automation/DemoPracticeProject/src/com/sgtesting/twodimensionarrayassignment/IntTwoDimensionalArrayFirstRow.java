package com.sgtesting.twodimensionarrayassignment;

public class IntTwoDimensionalArrayFirstRow {

	public static void main(String[] args) {
		int a[][]= {{100,200,300},{400,500,600},{700,800,900}};
		for (int i=0;i<a.length/2;i++)
		{
			for (int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
