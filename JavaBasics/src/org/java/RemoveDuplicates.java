package org.java;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String a = "Marutha Perumal";
		String b ="";
		
		for(int i=0; i<a.length(); i++) {
			
		char c = a.charAt(i);
		if(b.indexOf(c) == -1) {
			b += c;
		}
		}
		
		System.out.println("Without Duplicates " + b);
		
	}
	
	
}
