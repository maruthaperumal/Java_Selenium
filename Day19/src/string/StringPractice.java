package string;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		
		String s = "Hello Everyone";
		String s1 = new String (" Welcome to our Java class");
		String s2 = "Hello Everyone";
		String s3 = "what is your name?";
		
		System.out.println(s);
		
//		String Methods
//		length
		System.out.println();
		int a= s.length();
		System.out.println("Length of string: "+s.length());
		
//		concat 
		System.out.println();
		System.out.println("Concatenated class: "+s. concat(s1));
		
//		trim
		System.out.println();
		System.out.println("Before trim: "+s1);
		System.out.println("After trim: "+s1.trim());
		
//		charAt
		System.out.println();
		char c = s1.charAt(6);
		System.out.println("Character of 6th index in s1 is "+c);
		
//		contains
		System.out.println();
		boolean x = s.contains(s1);
		boolean y = s1.contains("Java");
		System.out.println("Check s and s1 are same: "+x);
		System.out.println("Check java word in s1: "+y);
		
//		equals
		System.out.println();
		System.out.println("Using equal method to check our and Our are equal: "+"our".equals("Our"));
		
//		equals Ignore case
		System.out.println();
		System.out.println("Using equal Ignore case method to check our and Our are equal: "+"our".equalsIgnoreCase("Our"));
		
//		replace
		System.out.println();
		System.out.println("Using replace method to change single charcter: "+s.replace('o', 'a'));
		System.out.println("Using replace method to change multiple charcter: "+s1.replace("Java", "Python"));
		
//		substring
		System.out.println();
		System.out.println("Substring of s is "+s.substring(0, 2));
		System.out.println("Substring of s1 is "+s1.substring(0, 9));
		
//		to upper case and to lower case
		System.out.println();
		System.out.println("Using lower case method: "+s.toLowerCase());
		System.out.println("Using Upper case method: "+s.toUpperCase());
		
//		Split
		System.out.println();
		String [] q = s3.split(" ");
		System.out.println("s3 split: "+Arrays.toString(q));
		String [] p = s1.split("");
		System.out.println("s1 split: "+Arrays.toString(p));
		
//		starts with
		System.out.println();
		System.out.println(s.startsWith("Hi"));
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.startsWith("E", 6));
		
//		ends with
		System.out.println();
		System.out.println(s3.endsWith("?"));
		System.out.println(s.endsWith("class"));
		
//		index of
		System.out.println();
		System.out.println("N index value in s is "+s.indexOf("n"));
		System.out.println("J index value in s1 is "+s1.indexOf("J"));
		System.out.println("R index value in s3 is "+s3.indexOf("r"));
		
		}

	}


 