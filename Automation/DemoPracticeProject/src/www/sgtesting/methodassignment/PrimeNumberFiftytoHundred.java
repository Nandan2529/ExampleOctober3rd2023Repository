package www.sgtesting.methodassignment;

class Demo1
{
	void isPrime()
	{
		for (int num=50;num<=100;num++)
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
				System.out.println(num+" is a Prime Number");	
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
		}
	}
}
	public class PrimeNumberFiftytoHundred {
		public static void main(String[] args) {
			Demo1 o=new Demo1();
			o.isPrime();

		}

	}
