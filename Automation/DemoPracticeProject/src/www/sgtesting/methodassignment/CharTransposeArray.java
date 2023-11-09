package www.sgtesting.methodassignment;

class Demo5
{
	void Twoarray(char a[][])
	{
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}

	}
}
public class CharTransposeArray {
	public static void main(String[] args) {
		Demo5 o=new Demo5();
		char a[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'}};
		o.Twoarray(a);

	}

}
