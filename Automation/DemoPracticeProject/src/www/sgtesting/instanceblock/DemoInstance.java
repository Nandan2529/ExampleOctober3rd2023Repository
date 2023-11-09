package www.sgtesting.instanceblock;

class Demo1
{
	void add(int a,int b)
	{
		Demo2.sub(15, 10);
		System.out.println("Addition Result"+(a+b));
	}
}
class Demo2
{
	static void sub(int c,int d)
	{
		System.out.println("Sub Result :"+(c-d));
	}
}
public class DemoInstance {
	public static void main(String[] args) {
		Demo1 o=new Demo1();
		o.add(20, 10);
	}

}
