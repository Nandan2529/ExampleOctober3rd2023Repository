package com.sgtesting.arraysassignment;

public class FloatArraySecondHalfWhileLoop {

	public static void main(String[] args) {
		float a[]= {15.2f,22.5f,30.4f,45.2f,50.5f,62.5f};
		int i=a.length/2;
		while(i<a.length)
		{
			System.out.println(a[i]);
			i++;
		}

	}

}
