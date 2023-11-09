package www.sgtesting.constructoroverloading;

class Demo
{
	Demo(int a[])
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("Sum Results :"+sum);
	}
}
public class ConstructorSingleDimensionArray {
	public static void main(String[] args) {
		int b[]= {2,4,6,8,10};
		Demo o=new Demo(b);

	}

}
