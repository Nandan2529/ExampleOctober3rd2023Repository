package www.sgtesting.test1;

class Array
{
	int[] Array(int a[])
	{
	   int  sum=0;
		int x[]=new int[a.length];
		int k=0;
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			k++;
		}
		return sum;
	}
    
}
public class Test9 {
	public static void main(String[] args) {
		Array o=new Array();
		int c[]= {10,20,30,40,50,60};
		int b[]=o.Array(c);
		for (int i=b.length/2;i<b.length;i++)
		{
			System.out.println(sum);
		}

	}

}
