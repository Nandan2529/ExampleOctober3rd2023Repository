package www.sgtesting.methodassignment;

class Demo
{
	void Cube(int num,int b) 
	{
		for (int i=num;i>=1;i--)
		{
			b=i*i*i;

			System.out.println("Cube Number :"+b);

		}
	}
}
public class CubeReverseOrder {
	public static void main(String[] args) {
		Demo o=new Demo();
		o.Cube(10,1);

	}

}
