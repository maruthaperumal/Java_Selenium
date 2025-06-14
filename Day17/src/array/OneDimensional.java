package array;

import java.util.Arrays;

public class OneDimensional {

	public static void main(String[] args) {
		int a [] = new int [7]; // declaration
		
		a [0]= 70;    // assigning values
		a [1]= 40;
		a [2]= 30;
		a [3]= 20;
		a [4]= 50;
		a [5]= 60;
		a [6]= 10;
		
		System.out.println(a.length); // find size of an array
		
		System.out.println(a[3]);
		
		System.out.println("Entered Seventh value : "+a[6]);
		
		for (int i=0; i<a.length;  i++) {
			System.out.println(" " +a[i]);
			
			
		}
		System.out.println("Reading data using Arrays class");
		System.out.println(Arrays.toString(a));
		
//		System.out.println("Sorting data using Arrays class");
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
//		System.out.println("Sorting data in vertical using Array class");
//		for (int i =0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		System.out.println("Reading data from enhanced for loop");
		Arrays.sort(a); // if we want sort use this keyword
		for (int i : a) {
			System.out.println(i);
			 
		}
			
		}
		}
	
	

