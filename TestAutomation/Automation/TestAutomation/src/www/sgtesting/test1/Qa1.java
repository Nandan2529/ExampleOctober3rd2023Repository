package www.sgtesting.test1;

class Demob
{
	 int evenNum(int num)
	 {
		 for(int i=20;i<=num;i++)
		 {
			 if(i%2==0)
			 {
				 
			 }
			 return num;
		 }
		
	 }
		
}
public class Qa1 {
	public static void main(String[] args) {
		
       Demob o=new Demob();
      int a= o.evenNum(30);
      System.out.println(a);
	}

}
