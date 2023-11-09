package www.sgtesting.reverseassignment;

class Demo5
{
	 String stringArray(String x[][])
	{
		 String y=" ";
		for (int i=0;i<x.length;i++)
		{
		for (int j=0;j<x[i].length;j++)
		{
			y=y+x[i][j];
		}
		}
		return y;
	}
}
public class DemoString {
	public static void main(String[] args) {
		Demo5 o=new Demo5();
		String y[][]= {{"One","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine"}};
		String a=o.stringArray(y);
		System.out.println(a);

	}

}
