package com.sgtesting.twodimensionarrayassignment;

public class ModulusTwoDimensionArray {

	public static void main(String[] args) {
		int a[][]= {{100,200,300},{400,500,600},{700,800,900}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]%2+" ");
			}
			System.out.println();
		}
	}

}
