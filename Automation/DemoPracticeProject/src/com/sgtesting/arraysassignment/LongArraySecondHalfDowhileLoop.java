package com.sgtesting.arraysassignment;

public class LongArraySecondHalfDowhileLoop {

	public static void main(String[] args) {
		long b[]= {10,20,30,40,50,60};
		int i=b.length/2;
			do
		{
				System.out.println(b[i]);
				i++; 
		} while(i<b.length);

	}

}
