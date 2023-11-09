package www.sgtesting.inheritenceassignment;

class Grandparent
{
	void displayinfo(String name)
	{
		System.out.println("Grandparent Name is: "+name);
	}
}

class Parent extends Grandparent
{
	Parent(String name)
	{
		super.displayinfo(name);
	}

	void displayinfo(String name)
	{
		System.out.println("Parent name: "+name);
	}
}

class Child extends Parent
{
	Child(String name,String name1)
	{
		super(name); 
		super.displayinfo(name1);
	}

	void displayinfo(String name)
	{
		System.out.println("Child12 Name: "+name);
	}
}
public class SameNameMultilevel {
	public static void main(String[] args){

		Child c=new Child("Karthik", "Manoj");
		c.displayinfo("Akash");

	}

}
