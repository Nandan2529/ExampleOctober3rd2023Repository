package com.sgtesting.arraysassignment;

public class CharArraySecondHalf {

	public static void main(String[] args) {
		char ch[]= {'A','B','C','D','E','F','G','H'};
		int i=ch.length/2;
		while(i<ch.length)
		{
			System.out.println(ch[i]);
			 i++;
		}
	}
}
