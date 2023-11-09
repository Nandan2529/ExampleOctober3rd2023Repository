package www.sgtesting.inheritenceassignment;

class College
{
	String Collname;
	String location;
	int Pno;
	College()
	{
		Collname="Rajeev Institute of Technology";
		location="Hassan";
		Pno=258456412;
		System.out.println("College Name :"+Collname);
		System.out.println("Location :"+location);
		System.out.println("Phone Number :"+Pno);
	}	
}
class Branch extends College
{
	String Bname;
	String Floor;
	int Pno;
	Branch()
	{
		Bname="Civil Enigenering";
		Floor="5th Floor";
		Pno=521456123;
		System.out.println("Branch Name :"+Bname);
		System.out.println("Floor :"+Floor);
		System.out.println("Phone Number :"+Pno);		
	}
}
class Student extends Branch
{
	String Sid;
	String Sname;
	int Pno;
	Student()
	{
		Sid="01";
		Sname="Nandan";
		Pno=971456123;
		System.out.println("Student Id :"+Sid);
		System.out.println("Student name :"+Sname);
		System.out.println("Phone Number :"+Pno);	
	}
}

public class MultilevelInheritence {
	public static void main(String[] args) {
    
		Student o=new Student();
	}

}
