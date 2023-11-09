package p1;

public class IndependentClass {
	Protection p=new Protection();
	public  IndependentClass()
	{
		System.out.println("It is a Independent Protection Class Constructor");
		//		System.out.println("private_a :"+private_a);
				System.out.println("protected_b :"+p.protected_b);
				System.out.println("default_c :"+p.default_c);
				System.out.println("public_d :"+p.public_d);
				System.out.println("**************");
	}
}
