package www.sgtesting.constructoroverloading;

class Maths
{
	Maths(int x,int y,String action)
	{
		int res=0;
		switch(action)
		{
		case "add":
			res=(x+y);
			System.out.println("Addition Result :"+res);
			break;
		case "sub":
			res=(x-y);
			System.out.println("Substraction Result :"+res);
			break;
		case "mult":
			res=(x*y);
			System.out.println("Multiplication Result :"+res);
			break;
		case "div":
			res=(x/y);
			System.out.println("Division Result :"+res);
			break;
		}
	}
}
public class BasicMaths {
	public static void main(String[] args) {
     Maths o1=new Maths(10,60,"add");
     Maths o2=new Maths(120,60,"sub");
     Maths o3=new Maths(240,60,"mult");
     Maths o4=new Maths(10,12,"div");

	}

}
