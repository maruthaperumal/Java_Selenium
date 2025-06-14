package org.maruthu;

public class Default {
	int x = 4;
	int y = 2;
	
	void divide() {
		System.out.println(x/y);
		
	}
	
	public static void main(String[] args) {
		Default obj = new Default();
		obj.divide();
	}

}
