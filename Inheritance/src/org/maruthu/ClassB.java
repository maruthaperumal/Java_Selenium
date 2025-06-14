package org.maruthu;

public class ClassB extends ClassA {    // single
	
//int x = 5;
//int y = 2;
	
	public void sub() {
		System.out.println(x-y);
	}

	public static void main(String[] args) {
//		Private obj = new Private();
		ClassB obj = new ClassB();
		obj.sub();
	}

}
