package org.day9;

public class SBI extends RBIbank{

	public static void main(String[] args) {
	RBIbank obj = new SBI();
	
	obj.saving();
	obj.current();
		
	}

	@Override
	public void saving() {
	System.out.println("Savings ROI 6%");
		
	}

	@Override
	public void current() {
		System.out.println("Current ROI 6.5%");
		
		
	}

}
