package www.sgtesting.interfacedemo;

interface University1
{
	void UniversityName(String name);
}
interface College1
{
	abstract void CollegeName(String name);
}
class RitEngineering1 implements University1,College1
{
	public void UniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	public void CollegeName(String name)
	{
		System.out.println("College Name :"+name);
	}
	void location(String location)
	{
	    System.out.println("Location :"+location);	
	}
}
public class Qa2 {
	public static void main(String[] args) {
		RitEngineering1 o=new RitEngineering1();
		o.UniversityName("Vtu");
		o.CollegeName("Navkis Institute of Technology");
		o.location("Belgaum");
		

	}

}
