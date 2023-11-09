package www.sgtesting.inheritenceassignment;

class Studente
{
	Studente(String fname,String location)
	{
		System.out.println("First Name :"+fname);
		System.out.println("Location :"+location);
	}
}
class Librarya extends Studente
{
	String bookname;
	Librarya(String fname,String location,String bookname)
	{
		super(fname,location);	
		this.bookname=bookname;
		System.out.println("Book Name :"+bookname);
	}
}
class Sporta extends Studente
{
	String Sname;
	Sporta(String fname,String location,String bookname,String Sname)
	{
		super(fname,location);
		this.Sname=Sname;
		System.out.println("Sport :"+Sname);
	}
}

public class ParameterizedHiracelInheritence {
	public static void main(String[] args) {
		Sporta o=new Sporta("Prajwal","Banglore","Python","Chess");
		System.out.println("**************");
		Sporta o1=new Sporta("Prajwal","Banglore","core java","Cricket");

	}

}
