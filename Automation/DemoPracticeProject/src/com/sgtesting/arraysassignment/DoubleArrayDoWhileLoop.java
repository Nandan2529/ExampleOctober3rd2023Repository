package com.sgtesting.arraysassignment;

public class DoubleArrayDoWhileLoop {

	public static void main(String[] args) {
		double a[]= {10.5,20.5,30.5,40.5,50.5,60.5};
		int i=a.length-1;
		do
		{
			System.out.println(a[i]);
			i--;
		} while(i>=0);

	}

}
