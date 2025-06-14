package org.maruthu;

public class ClassC extends ClassB {     // multi level
//	int x = 4;
//	int y = 2;
	
	void divide() {
		System.out.println(x/y);
		
	}
	
	public static void main(String[] args) {
		ClassC obj = new ClassC();
		obj.divide();
	}

}
