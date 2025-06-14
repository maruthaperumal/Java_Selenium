package org.maruthu;

public class ClassD extends ClassC,ClassB {    // multiple we can't achieve in java
//	int x = 4;
//	int y = 2;
	
	void multiply() {
		System.out.println(x*y);
		
	}
	
	public static void main(String[] args) {
		ClassD obj = new ClassD();
		obj.multiply();
	}


}
