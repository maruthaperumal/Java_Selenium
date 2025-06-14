package org.maruthu;

public class Private {
		
	 int x = 5;
	 int y = 2;
	
	private void add() {
	//	int a = 4;
	//	int b = 3;
	//	System.out.println(a+b);
		System.out.println(x+y);
		
	}

	public static void main(String[] args) {
	Private obj = new Private();
	obj.add();
	

	}

}
