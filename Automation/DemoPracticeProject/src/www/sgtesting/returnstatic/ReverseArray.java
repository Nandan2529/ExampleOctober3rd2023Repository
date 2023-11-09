package www.sgtesting.returnstatic;

class Reverse
{
	int[] Reverse(int a[])
	{
		int x[]=new int[a.length];
		int k=0;
		for (int i=a.length-1;i>=0;i--)
		{
			x[k]=a[i];
			k++;
		}
		return x;
	}

}
public class ReverseArray {
	public static void main(String[] args) {
		Reverse o=new Reverse();
		int c[]= {10,20,30,40,50,60};
		int b[]=o.Reverse(c);
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
