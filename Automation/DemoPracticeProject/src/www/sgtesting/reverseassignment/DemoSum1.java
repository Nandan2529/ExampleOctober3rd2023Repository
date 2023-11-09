package www.sgtesting.reverseassignment;

class SumDemo2
{
	int sum(int a,int b)
	{
		int sum=0;
		for (int i=a;i<=b;i++)
		{
			if (i%7==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class DemoSum1 {
	public static void main(String[] args) {
      SumDemo2 o=new SumDemo2 ();
      int b=o.sum(100, 200);
      System.out.println("Sum is :"+b);

	}

}
