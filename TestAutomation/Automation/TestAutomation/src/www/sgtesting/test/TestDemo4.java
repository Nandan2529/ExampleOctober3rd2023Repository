package www.sgtesting.test;

public class TestDemo4 {

	public static void main(String[] args) {
		int sum=0;
		int a[]= {100,200,300,400,500,600,700,800};
		for (int i=0;i<a.length/2;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);

	}

}
