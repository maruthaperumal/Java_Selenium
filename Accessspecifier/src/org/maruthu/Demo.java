package org.maruthu;

public class Demo {
	int x = 5;
    int y = 2;
	
	private void add() {
		System.out.println(x+y);
	}
    public void sub() {
		System.out.println(x-y);
	}
    void divide() {
		System.out.println(x/y);	
	}
    protected void multiply() {
		System.out.println(x*y);
		
	}
    public static void main(String[] args) {
    	
    	Demo obj = new Demo();
		
		
		obj.multiply();
		obj.sub();
		obj.add();
		obj.divide();
		
	}

}
