package www.sgtesting.instanceblock;

class Outer
{
	String firstName;
	Inner inner=new Inner();
	void display()
	{
		inner.age=21;
		System.out.println("Age :"+inner.age);
	}
	class Inner
	{
		int age;
		void FN()
		{
			firstName="Nandan";
			System.out.println("First Name :"+firstName);
		}
		
	}
}
public class OuterAndInner {
	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.display();
		outer.inner.FN();

	}

}
