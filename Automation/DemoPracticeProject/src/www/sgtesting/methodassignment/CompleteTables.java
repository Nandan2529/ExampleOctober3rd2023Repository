package www.sgtesting.methodassignment;

class Demo4
{
	void Table()
	{
		int a;
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=10;j++) 
			{
				a = i * j;
				System.out.println(i+ " * "+j+" = "+a);
			}
			System.out.println();
		}
	}
}
public class CompleteTables {
	public static void main(String[] args) {
		Demo4 o=new Demo4();
		o.Table();
	}

}
