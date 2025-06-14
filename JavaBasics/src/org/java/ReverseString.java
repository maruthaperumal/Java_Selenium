package org.java;

public class ReverseString {
	
	
	static String String = "hello, World!";
	
	static String reverse = new StringBuilder(String).reverse().toString();
	
	static String Str = "MADAM";
	
	static String rev = new StringBuilder(Str).reverse().toString();
	
	static String name = "M@RUTH@ PERUM@L";
	
	static String revs = new StringBuilder(name).reverse().toString();
	
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Reversed: " +reverse);
		System.out.println("Reversed1: " +rev);
		System.out.println("Reversed2: " +revs);
		
		
	}

}
