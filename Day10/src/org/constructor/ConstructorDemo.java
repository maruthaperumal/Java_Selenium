package org.constructor;

public class ConstructorDemo {
	
//	int a;
//	boolean type;
//	
	public ConstructorDemo() {
	System.out.println("Default");
	}
//	
	public ConstructorDemo(int a, boolean type) {
//	this.a = a;
//	this.type = type;
		System.out.println(a);
		System.out.println(type);
	}
//
//	public static void main(String[] args) {
//		
//	ConstructorDemo cd = new ConstructorDemo();
//	System.out.println(cd.a);
//	
//	ConstructorDemo cd1 = new ConstructorDemo(25, true);
//	System.out.println(cd1.a);
//	System.out.println(cd1.type);
//
//	}
public static void main(String[] args) {
	
	new ConstructorDemo();
	new ConstructorDemo(10,true);
	

}
	
	
}
