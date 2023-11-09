package www.sgtesting.abstractassignment;

abstract class Parent011
{
	void parentName(String name)
	{
		System.out.println("Parent name :"+name);
	}
	void ParentLocation(String location)
	{
		System.out.println("Location :"+location);
	}
}
class Child012 extends Parent011
{
	void ChildName(String name)
	{
		System.out.println("Child name:"+name);
	}
}
public class OnlyInstanceMethod {
	public static void main(String[] args) {
		Child012 o=new Child012();
		o.parentName("Yogesh");   //instance method
		o.ParentLocation("Hassan");
		o.ChildName("Chandan");

	}

}
