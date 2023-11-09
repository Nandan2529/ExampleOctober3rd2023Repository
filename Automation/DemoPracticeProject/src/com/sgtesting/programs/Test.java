package com.sgtesting.programs;

public class Test {

	public static void main(String[] args) {
			
	int a[]=new int[10];
	int b=0;
	int num=12;
	for (int j=10;j>=1;j--)
	{
			int res=j*num;
			a[b]=res;
			b++;
	}
	
	for (int m=a.length-1;m>=0;m--)
	{
		System.out.println(a[m]);
	}
	}

}
