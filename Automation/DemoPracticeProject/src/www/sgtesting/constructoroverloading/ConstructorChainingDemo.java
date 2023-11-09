package www.sgtesting.constructoroverloading;

class College
{
	College (String fname)
	{
		System.out.println("First name :"+fname);
	}
	College (int branchcount)
	{
		this("SLN Engineering College");
		System.out.println("# of branches in College :"+ branchcount);	
	}
}
public class ConstructorChainingDemo {
	public static void main(String[] args) {
		College o1=new College(5);

	}

}
