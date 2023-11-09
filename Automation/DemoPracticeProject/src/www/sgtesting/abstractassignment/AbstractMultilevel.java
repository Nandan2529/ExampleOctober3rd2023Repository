package www.sgtesting.abstractassignment;

abstract class College
{
	abstract void CollegeName(String name);

}
class EngineeringCollege  extends College
{
    void CollegeName(String name)
    {
    	System.out.println("Engineering College Name :"+name);
    }
    //abstract void CityName(String name);
}
class Branches extends EngineeringCollege
{
	void Branchname(String name)
	{
		System.out.println("Branch name :"+name);
	}
	void CityName(String name)
	{
		System.out.println("City name :"+name);
	}
}
public class AbstractMultilevel {
	public static void main(String[] args) {
		Branches o=new Branches();
		o.CollegeName("Rajeev Institute of Technology");
		o.CityName("Hassan");
		o.Branchname("CV");

	}

}
