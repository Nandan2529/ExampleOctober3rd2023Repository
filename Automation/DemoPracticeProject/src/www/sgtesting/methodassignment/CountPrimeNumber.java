package www.sgtesting.methodassignment;

class Demo7
{
	void isPrime()
	{ 
		int count=0;
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
			count++;
			}
		}
		System.out.println(count);
		
	}
}
public class CountPrimeNumber {
	public static void main(String[] args) {
		Demo7 o=new Demo7();
		o.isPrime();

	}

}
