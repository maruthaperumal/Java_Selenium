package org.day9;

public class Interfaceclass implements Interdemo {

	@Override
	public void car() {
		System.out.println("Honda");
		
	}

	@Override
	public void bike() {
		System.out.println("KTM");
		
	}
	
	
	
	public static void main(String[] args) {
		Interfaceclass ifc = new Interfaceclass();
		ifc.bike();
		ifc.car();
		ifc.truck();
		
	}

}
