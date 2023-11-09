package www.sgtesting.abstractassignment;

abstract class Parent11{
	Parent11(String name,int age){
		System.out.println( "String name :"+name);
		System.out.println("Age :"+age);
	}
}

class Child11 extends Parent11{
	String location;
	Child11(String name,int age,String location){
		super(name,age);
		this.location=location;
		System.out.println("Location :"+location);
	}
}
class Child22 extends Child11{
	String Hobbie;
	Child22(String name,int age,String location,String Hobbie){
		super(name,age,location);
		this.Hobbie=Hobbie;
		System.out.println("Hobbie :"+Hobbie);
	}
}
public class ParametrizedMultilevel {
	public static void main(String[] args) {
		Child22 o=new Child22("Karthik",25,"Hassan","Cricket");


	}

}
