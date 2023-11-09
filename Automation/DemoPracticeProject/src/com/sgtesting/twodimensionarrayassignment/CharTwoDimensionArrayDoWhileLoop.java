package com.sgtesting.twodimensionarrayassignment;

public class CharTwoDimensionArrayDoWhileLoop {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','C'},{'D','E','F'}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(ch[i][j]+" ");
				j++;
			} while(j<ch[i].length);
			System.out.println();
			i++;
		} while(i<ch.length);

	}

}
