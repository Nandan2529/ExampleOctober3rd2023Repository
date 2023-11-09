package www.sgtesting.constructoroverloading;

class Demo4
{
	Demo4 (int num)
	{
		int flag=0;
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
			{
             flag=flag+1;
             break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is not a Prime Number");
		}
	}
}
public class ConstructorPrimeNumber {
	public static void main(String[] args) {
     Demo4 o1=new Demo4(7);
     Demo4 o2=new Demo4(21);
     Demo4 o3=new Demo4(31);

	}

}
