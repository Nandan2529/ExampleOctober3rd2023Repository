package www.sgtesting.reverseassignment;

class SumDemo1
{
	int sum1(int num)
	{
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class DemoSum {
	public static void main(String[] args) {
		SumDemo1 o=new SumDemo1();
		int  s=o.sum1(20);
		System.out.println("Sum is :"+s);

	}

}
