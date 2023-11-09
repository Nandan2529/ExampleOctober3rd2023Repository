package www.sgtesting.constructoroverloading;

class Demo5
{
	Demo5()
	{
	  int fn=0;
	  int sn=1;
	  System.out.println(fn);
	  System.out.println(sn);
	  for (int i=1;i<=10;i++)
	  {
		  int tn=fn+sn;
		  System.out.println(tn);
		  fn=sn;
		  sn=tn;
	  }
	}
}
public class FibonancciNumber {
	public static void main(String[] args) {
		Demo5 o=new Demo5();

	}

}
