package www.sgtesting.methodassignment;

class Demo6
{
	void isPrime()
	{
		for (int num=250;num>=200;num--)
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
	public class PrimeNumberTwofiftyToTwoHundred {
		public static void main(String[] args) {
			Demo6 o=new Demo6();
			o.isPrime();


		}

	}
