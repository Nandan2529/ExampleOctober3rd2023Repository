package www.sgtesting.methodassignment;

class Demo10
{
	void isPrime()
	{
		int sum=0;
		for (int num=1;num<=100;num++)
		{
			int flag=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag+=1;
					break;
				}
			}

			if(flag==0)
			{
				sum=sum+num;
			}	
		}
		System.out.println(sum);
	}
}

public class SumOfPrimeNumber {
	public static void main(String[] args) {
		Demo10 o=new Demo10();
		o.isPrime();

	}

}
