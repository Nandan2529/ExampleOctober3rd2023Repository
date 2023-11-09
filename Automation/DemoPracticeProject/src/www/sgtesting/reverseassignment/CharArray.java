package www.sgtesting.reverseassignment;

class CharDemo
{
	char[] twodarray(char ch[][])
	{
		char[] res=new char[ch.length];
		int k=0;
		for (int i=0;i<ch.length;i++)
		{
			res[k]=ch[0][i];
			k++;
		}
		return res;
	}
}
public class CharArray {
	public static void main(String[] args) {
		CharDemo o=new CharDemo();
		char a[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
		char b[]=o.twodarray(a);
		for (int j=0;j<b.length;j++)
		{
			System.out.println(b[j]+" ");
		}


	}

}
