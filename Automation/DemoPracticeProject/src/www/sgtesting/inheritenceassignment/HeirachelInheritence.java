package www.sgtesting.inheritenceassignment;

class Company
{
	String Cname;
	String location;
	int Pno;
	Company()
	{
		Cname="Zindal";
		location="Bangalore";
		Pno=978540152;
		System.out.println("Company Name:"+Cname);
		System.out.println("Location :"+location);
		System.out.println("Phone Number :"+Pno);
	}	
}
class Employee1 extends Company
{
	String Eid;
	String EmploName;
	int Pno;
	Employee1()
	{
		Eid="025";
		EmploName="Chandan";
		Pno=785540152;
		System.out.println("Employee Id :"+Eid);
		System.out.println("Employee Name :"+EmploName);
		System.out.println("Phone Number :"+Pno);
	}	
}
class Employee2 extends Company
{
	String Eid;
	String EmploName;
	int Pno;
	Employee2()
	{
		Eid="018";
		EmploName="Prajwal";
		Pno=985540152;
		System.out.println("Employee Id :"+Eid);
		System.out.println("Employee Name :"+EmploName);
		System.out.println("Phone Number :"+Pno);
	}	
}

public class HeirachelInheritence {
	public static void main(String[] args) {
       Employee1 o=new Employee1();
       System.out.println("***************");
       Employee2 o1=new Employee2();

	}

}
