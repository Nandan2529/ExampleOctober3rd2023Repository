package www.sgtesting.abstractassignment;

abstract class House
{
	abstract void HouseName(String HouseName);
}
class Window extends House
{
	void HouseName(String HouseName)
	{
		System.out.println("House name:"+HouseName);
	}
	void windows(String windows)
	{
		System.out.println("Windows :"+windows);
	}
}
class Door extends Window
{
	void door(String door)
	{
		System.out.println("Door :"+door);
	}
}
class Room extends House
{
	void HouseName(String HouseName)
	{
		System.out.println("House name:"+HouseName);
	}
	void Room(String Room)
	{
		System.out.println("Room :"+Room);
	}
}
public class HybridInheritence {
	public static void main(String[] args) {
		
		Door o=new Door();
		o.HouseName("Lakshmi Nilaya");
		o.windows("Sandal");
		o.door("Teak");
		
		System.out.println("***********");
		Room o1=new Room();
		o1.HouseName("Pooja Nilaya");
		o1.Room("Bed Room");
	}
}
