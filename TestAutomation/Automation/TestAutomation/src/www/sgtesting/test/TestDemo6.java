package www.sgtesting.test;

public abstract class TestDemo6 {

	public static void main(String[] args) {
		String a[][]= {{"One","Two","Three"},{"Four","Five","Six"},{"Seven","Eight","Nine"}};
		String b=" ";
		for (int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				b=b+a[i][j];
			}
		}
        System.out.println(b);
	}

}
