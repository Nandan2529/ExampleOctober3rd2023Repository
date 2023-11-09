package com.sgtesting.arrays;

public class CharacterTwoDimensionArray {

	public static void main(String[] args) {
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'}};
		for (int i=0;i<ch.length;i++)
		{
			for (int j=0;j<ch[i].length;j++)
			{
				System.out.print(ch[i][j]+" ");
			}
			System.out.println();
		}


	}

}
