package operators;

public class Practice {
	
	static int a = 5;
	static int b = 3;

	public static void main(String[] args) {
		
		System.out.println("Arithmetic Operator");
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	
		System.out.println("Assignment Operator");
		int a = 99;
		
		System.out.println(a+=5);
		System.out.println(a-=5);
		System.out.println(a*=5);
		System.out.println(a/=5);
		System.out.println(a%=5);
	
		System.out.println("Relational / Comparison Operator");
//		int b = 20;
//		int c = 15;
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("Logical Operator");
		int x = 18;
		int y = 15;
//		Logical operator && is and, || is or, ! is not
		
		System.out.println(x>y && x!=y);
		System.out.println(x<y && x==y);
		System.out.println(x<y || x==y);
		System.out.println(!(x<y));
		
		
		System.out.println("Increment & Decrement Operator");
		int e = 25;
		
		System.out.println(e); // 25
		System.out.println(e++); // 25
		System.out.println(e+2); // 28
		System.out.println(++e); // 27
		System.out.println(e--); // 27
		System.out.println(e-2); // 24
		System.out.println(--e); // 25
			
	}

}	

		
		
		
		
		
		
		
		
		
		

