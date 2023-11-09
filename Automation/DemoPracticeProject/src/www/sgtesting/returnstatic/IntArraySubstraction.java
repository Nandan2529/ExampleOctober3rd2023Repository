package www.sgtesting.returnstatic;

class Demo1
{
	int[] Sub(int a[],int b[])
	{
		int x[]=new int[a.length];
		int k=0;
		for (int i=0;i<a.length;i++)
		{
			x[k]=a[i]-b[i];
			k++;
		}
		return x;
	}
}
public class IntArraySubstraction {
	public static void main(String[] args) {
		Demo1 o=new Demo1();
		int y[]= {15,17,19,21,23,30};
		int z[]= {7,11,15,12,20,22};
		int res[]=o.Sub(y, z);
		for(int i=res.length/2;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}

}
