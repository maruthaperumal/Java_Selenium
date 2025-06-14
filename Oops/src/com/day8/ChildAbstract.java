package com.day8;

public class ChildAbstract extends Abstractclass {

	@Override
	public void Dog() {
	System.out.println("has four legs");
		
	}

	@Override
	public void Duck() {
    System.out.println("has only two legs");	
		
		
	}
	
	public static void main(String[] args) {
	ChildAbstract obj = new ChildAbstract();
	obj.Dog();
	obj.Duck();
	}

}
