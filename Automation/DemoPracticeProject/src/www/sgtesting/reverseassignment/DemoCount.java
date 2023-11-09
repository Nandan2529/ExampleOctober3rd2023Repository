package www.sgtesting.reverseassignment;

class DemoCount1
{
	int count(int x,int y)
	{
		int count=0;
		for (int i=x;i<=y;i++)
		{
			if (i%2==0)
			{
				count++;
			}
		}
		return count;
	}
}
public class DemoCount {
	public static void main(String[] args) {
		DemoCount1 o=new DemoCount1();
		int a=o.count(150, 250);
		System.out.println("Count No is :"+a);

	}

}
