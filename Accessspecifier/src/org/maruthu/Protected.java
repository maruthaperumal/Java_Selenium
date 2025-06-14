package org.maruthu;

public class Protected {
	int x = 4;
	int y = 2;
	
	protected void multiply() {
		System.out.println(x*y);
		
	}
	
	public static void main(String[] args) {
		Protected obj = new Protected();
		obj.multiply();
	}


}
