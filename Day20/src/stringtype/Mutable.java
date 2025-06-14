package stringtype;

public class Mutable {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("I am Marutha");
		StringBuffer sb1 = new StringBuffer("I am Marutha");
		System.out.println("Before Appendend: "+sb);
		System.out.println("Using Append Keyword: "+sb.append(" Perumal M"));
		System.out.println("After Appendend: "+sb);
		System.out.println(sb.hashCode());
		System.out.println(sb.append(" Perumal M").hashCode());
		System.out.println(sb1.hashCode());
		System.out.println();
		
		
		StringBuilder sb2 = new StringBuilder("How are you");
		StringBuilder sb3 = new StringBuilder("How are you");
		System.out.println(sb2.hashCode());
		System.out.println(sb3.hashCode());
		System.out.println(sb3.reverse());
		System.out.println(sb3.append(" Uncle?"));
		System.out.println(sb3.append(" Uncle?").hashCode());



	}

}
