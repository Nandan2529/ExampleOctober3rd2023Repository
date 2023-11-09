package com.sgtesting.twodimensionarrayassignment;

public class ByteTwoDimensionArray {

	public static void main(String[] args) {
		byte a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}


	}

}
