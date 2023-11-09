package www.sgtesting.constructoroverloading;

class Demo1 {
	Demo1(int a[][])
	{
		int b[]=new int[a.length*a[0].length];
		int k=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				b[k]=a[i][j];
				k++;
			}
		}
		//Read elements from array
		for (int yy:b)
		{
			System.out.println(yy);
		}
	}
}

public class ConstructorTwoDarrayToSingleDarray {
	public static void main(String[] args) {
		

		int a[][]= {{100,200,300},{400,500,600}};
		Demo1 o=new Demo1(a);
		

	}

}
