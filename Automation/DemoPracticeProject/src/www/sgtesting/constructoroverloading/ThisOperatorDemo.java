package www.sgtesting.constructoroverloading;

class Student
{
	String Fn;
	String bname;
	int rno;
	Student (String Fn,String bname,int rno)
	{
	this.Fn=Fn;
	this.bname=bname;
	this.rno=rno;
	System.out.println("First name :"+Fn);
	System.out.println("Branch name :"+bname);
	System.out.println("Roll Number :"+rno);
	}
	void display()
	{
		System.out.println("In Method Body !!!!");
		System.out.println("First name :"+Fn);
		System.out.println("Branch name :"+bname);
		System.out.println("Roll Number :"+rno);	
	}
}
public class ThisOperatorDemo {
	public static void main(String[] args) {
		Student o=new Student("Nandan","CSE",25);
		o.display();
	}

}
