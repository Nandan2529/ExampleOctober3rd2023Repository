package www.sgtesting.test1;

class Demo1
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
public class Demo {
	public static void main(String[] args) {
		Demo1 o=new Demo1();
		int a=o.factDemo(5);
		System.out.println("Factorial Number :"+a);

	}

}
