package www.sgtesting.methodassignment;

class Demo3
{
	void TwoDArray(char ch[][])
	{
		for (int i=0;i<ch.length;i++)
		{
			for (int j=0;j<ch[i].length;j++)
			{
				char b=ch[i][j];
				System.out.print(b);
			}
		}
	}
}
public class CharConcatinationArray {
	public static void main(String[] args) {
		Demo3 o=new Demo3();
		char ch[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		o.TwoDArray(ch);


	}

}
