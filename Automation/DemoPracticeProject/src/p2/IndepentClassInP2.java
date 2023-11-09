package p2;
import p1.Protection;
public class IndepentClassInP2 {
	Protection p=new Protection();
	public IndepentClassInP2()
	{
		{
			System.out.println("It is SubclassP2 Class Constructor");
		//	System.out.println("private_a :"+private_a);
		//	System.out.println("protected_b :"+p.protected_b);
		//	System.out.println("default_c :"+default_c);
			System.out.println("public_d :"+p.public_d);
			System.out.println("**************");
	}

	}
}
