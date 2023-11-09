package www.sgtesting.abstractassignment;

abstract class Parent{
	abstract void method1(String name);
	abstract void method2(int pincode);
}

class Child extends Parent
{
	void method1(String name)
	{
		System.out.println("String Name :"+name);
	}
	void method2(int pincode) 
	{
		System.out.println("Pincode :"+pincode);
	}
}
public class AbstractStaticMethod {
	public static void main(String[] args) {
		Child o=new Child();
		o.method1("Karthik");
		o.method2(574210);

	}
}
