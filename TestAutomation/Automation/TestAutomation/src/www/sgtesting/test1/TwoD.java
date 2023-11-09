package www.sgtesting.test1;

class Demoa
{
	int[] Array(int x[])
	{
		int a[]=new int[x.length];
		int k=0;
		for (int i=0;i<x.length;i++)
		{
			a[k]=x[i];
			k++;
		}
		return a;
	}
}
public class TwoD {
	public static void main(String[] args) {
		Demoa o=new Demoa();
		int y[]= {10,15,20,25,30,35};
		int a[]= o.Array(y);
		System.out.print(a);

	}

}
