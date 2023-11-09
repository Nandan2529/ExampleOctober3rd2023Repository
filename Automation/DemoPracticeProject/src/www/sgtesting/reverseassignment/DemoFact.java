package www.sgtesting.reverseassignment;

class fact
{
	int factDemo(int num)
	{
		int fact=1;
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
public class DemoFact {
	public static void main(String[] args) {
		fact a=new fact();
		int m=a.factDemo(5);
		System.out.println("Factorial no is :"+m);

	}

}
