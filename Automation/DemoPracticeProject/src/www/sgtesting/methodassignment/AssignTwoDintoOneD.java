package www.sgtesting.methodassignment;

class Demo8
{
	void AssignArray(int x[][])
	{
		int m[]=new int[x.length*x[1].length];

		for (int i=0;i<x.length;i++)
		{

			m[i]=x[1][i];

			System.out.print(m[i]+" ");
		}
		System.out.println();
	}

}

public class AssignTwoDintoOneD {
	public static void main(String[] args) {
		int a[][]= {{100,200,300},{400,500,600},{700,800,900}};
		Demo8 o=new Demo8();
		o.AssignArray(a);

	}

}
