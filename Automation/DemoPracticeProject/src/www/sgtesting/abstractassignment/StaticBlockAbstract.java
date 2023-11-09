package www.sgtesting.abstractassignment;

abstract class Parent2{
	static {
		System.out.println("It Is A Static Block");
	}
}

class Child2 extends Parent2
{
		
}
public class StaticBlockAbstract {
	public static void main(String[] args) {
		Child2 ch = new Child2();

	}

}
