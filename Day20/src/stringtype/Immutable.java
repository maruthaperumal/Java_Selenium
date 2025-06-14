package stringtype;

public class Immutable {

	public static void main(String[] args) {
		
//		Immmutable
//		Literal string
		
		String s = ("Hello Everyone");
		String s1 = ("Hello Everyone");
		System.out.println("Before Concat: "+s);
		System.out.println(s.concat(", I am MP."));
		System.out.println("After Concat: "+s);
		System.out.println(s.hashCode());
		System.out.println(s.concat(", I am MP.").hashCode());
		System.out.println(s1.hashCode());
		System.out.println();
		
//		Non literal
		
		String s2 = new String ("Hello Everyone");
		String s3 = new String ("Hello Everyone");
		System.out.println("Before concat: "+s2);
		System.out.println(s2.concat(", I am Madhan."));
		System.out.println("After Contact: "+s2);
		System.out.println(s2.hashCode());
		System.out.println(s2.concat(", I am Madhan.").hashCode());
		System.out.println(s3.hashCode());

	}

}
