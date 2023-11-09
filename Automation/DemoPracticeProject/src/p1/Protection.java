package p1;

public class Protection {
	
	private int private_a=10;
	protected int protected_b=20;
	int default_c=30;
	public int public_d=40;
	
	public Protection()
	{
		System.out.println("It is a Protection Class Constructor");
		System.out.println("private_a :"+private_a);
		System.out.println("protected_b :"+protected_b);
		System.out.println("default_c :"+default_c);
		System.out.println("public_d :"+public_d);
		System.out.println("**************");
	}
	

}
