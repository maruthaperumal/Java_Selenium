package org.day9;

public interface Interdemo {
	
	void car();
	
	void bike();
	
	default void truck() {
	System.out.println("Ashok Leyland");
	}

}
