package www.sgtesting.returnstatic;
class Resultant
{
	int[] Result(int a[],int b[])
	{
		int x[]=new int[a.length+b.length];
		int k=0;
		for (int i=0;i<a.length;i++)
		{
			x[k]=a[i];
			k++;
		}
		for (int j=0;j<b.length;j++)
		{
			x[k]=b[j];
			k++;
		}
		return x;
	}
}
public class ResultantArray {
	public static void main(String[] args) {
		Resultant o=new Resultant();
		int c[]= {2,4,6,8,10};
		int d[]= {3,5,7,9,10};
		int res[]=o.Result(c, d);
		for (int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
