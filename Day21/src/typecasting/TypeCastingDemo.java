package typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
//	 Widening - Child class object been assugned to parent class
		
		byte b = 20;
		int c = b;
		System.out.println(c);
		
//		narrow - accessing parent class object into child class
		
		int d = 60;
		byte e = (byte)d;
		System.out.println(e);
		
		
		float f = d;
		double g = (double)f;
		int h = (int)f;
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

	}

}
