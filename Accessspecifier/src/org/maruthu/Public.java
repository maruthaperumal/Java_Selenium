package org.maruthu;

public class Public {
	
int x = 5;
int y = 2;
	
	public void sub() {
		System.out.println(x-y);
	}

	public static void main(String[] args) {
//		Private obj = new Private();
		Public obj = new Public();
		obj.sub();
	}

}
