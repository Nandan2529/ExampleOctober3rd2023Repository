package www.sgtesting.inheritenceassignment;

class Company1
{
	String Cname;
	String location;
	int Pno;
	Company1()
	{
		Cname="Infosis";
		location="Bangalore";
		Pno=975240152;
		System.out.println("Company Name:"+Cname);
		System.out.println("Location :"+location);
		System.out.println("Phone Number :"+Pno);
	}	
}
class Employee3 extends Company1
{
	String Eid;
	String EmploName;
	Double Salary;
	Employee3()
	{
		Eid="02";
		EmploName="Raju";
		Salary=24500.2;
		System.out.println("Employee Id :"+Eid);
		System.out.println("Employee Name :"+EmploName);
		System.out.println("Salary :"+Salary);
	}	
}
class Employee4 extends Employee1
{
	String Eid;
	String EmploName;
	Double Salary;
	Employee4()
	{
		Eid="03";
		EmploName="Karthik";
		Salary=44500.2;
		System.out.println("Employee Id :"+Eid);
		System.out.println("Employee Name :"+EmploName);
		System.out.println("Salary :"+Salary);
	}	
}
class Manager extends Company1
{
	String Mid;
	String ManagerName;
	Double Salary;
	Manager()
	{
		Mid="01";
		ManagerName="Mohan";
		Salary=64500.2;
		System.out.println("Employee Id :"+Mid);
		System.out.println("Employee Name :"+ManagerName);
		System.out.println("Salary :"+Salary);
	}	
}



public class HybridInheritence {
	public static void main(String[] args) {
    Manager o=new Manager();
    System.out.println("***************");
    
    Employee4 o1=new Employee4();

	}

}
