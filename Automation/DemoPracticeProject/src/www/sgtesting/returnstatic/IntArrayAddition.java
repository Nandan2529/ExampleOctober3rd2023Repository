package www.sgtesting.returnstatic;

class Demo
{
	int[] Add(int x[],int y[])
	{
		int a[]=new int[x.length];
		int k=0;
		for (int i=0;i<x.length;i++)
		{
			a[k]=x[i]+y[i];
			k++;
		}
		return a;
	}
}
public class IntArrayAddition {
	public static void main(String[] args) {
		Demo o=new Demo();
		int c[]= {2,4,6,8};
		int d[]= {1,3,5,7};
		int res[]=o.Add(c,d);
		for (int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
