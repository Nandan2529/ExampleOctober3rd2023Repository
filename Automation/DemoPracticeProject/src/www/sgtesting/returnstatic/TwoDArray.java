package www.sgtesting.returnstatic;

class Demo2
{
	int[] Array(int x[][])
	{
		int a[]=new int[x.length*x[0].length];
		int k=0;
		for (int i=0;i<x.length;i++)
		{
			for (int j=0;j<x[i].length;j++)
			{
				a[k]=x[i][j];
				k++;

			}
		}
		return a;
	}
}
public class TwoDArray {
	public static void main(String[] args) {
		Demo2 o=new Demo2();
		int y[][]= {{10,15,20},{25,30,35}};
		int res[]=o.Array(y);
		for (int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
