package www.sgtesting.constructoroverloading;

class Employee
{
	Employee(String name)
	{
		System.out.println("First name :"+name);
	}
		Employee (double Salary)
		{
		System.out.println("Salary :"+Salary);	
		}
		Employee (String address, int pincode)
		{
			System.out.println("Address :"+address);
			System.out.println("Pincode :"+pincode);
	}
}
public class EmployeeOverLoading {
	public static void main(String[] args) {
	Employee o1=new Employee("Nandan");
	Employee o2=new Employee(25000);
	Employee o3=new Employee("Hassan",572011);

	}

}
