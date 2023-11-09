package www.sgtesting.test;

public class TestDemo9 {

	public static void main(String[] args) {
		String str[]= {"10","20","30","40","50","60"};
		int sum=0;
		for (int i=0;i<str.length;i++)
		{
		sum=sum+Integer.parseInt(str[i]);
		}
         System.out.println(sum);
	}

}
