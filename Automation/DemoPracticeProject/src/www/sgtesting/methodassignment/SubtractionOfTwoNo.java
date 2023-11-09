package www.sgtesting.methodassignment;

class Demoa
{
	void MatrixSub(int a[][],int b[][])
	{
		if(a.length==b.length && a[0].length==b[0].length)
		{
			System.out.println("Before Transpose");
			int c[][]=new int[a.length][a[0].length];
			for (int i=0;i<a.length;i++)
			{
				for (int j=0;j<a[i].length;j++)
				{
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("After Transpose");
			
			for(int m=0;m<a.length;m++)
			{
				for(int n=0;n<a[m].length;n++)
				{
					System.out.print(c[n][m]+" ");
				}
				System.out.println();
			}
		}
	}
}
public class SubtractionOfTwoNo {
	public static void main(String[] args) {
		int k[][]= {{20,25,30},{10,15,18},{22,25,28}};
		int l[][]= {{5,4,10},{7,11,15},{18,22,15}};
		Demoa o=new Demoa();
		o.MatrixSub(k,l);

	}

}
