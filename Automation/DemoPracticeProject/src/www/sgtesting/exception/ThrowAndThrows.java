package www.sgtesting.exception;

class Sample
{
	static int Charcount(String str)throws Exception
	{
		if (str==null)
		{
			throw new Exception("The input is null");
		}
		return str.length();
	}
}
public class ThrowAndThrows {
	public static void main(String[] args) {
		try
		{
			int v1=Sample.Charcount("React");
			System.out.println("no of char :"+v1);
			int v2=Sample.Charcount(null);
			System.out.println("no of char :"+v2);
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
