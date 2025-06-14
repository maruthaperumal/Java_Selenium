package controlstatements;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		Scanner mat = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = mat.nextInt();
		
	
        if (a>0) {
        	System.out.println("Entered number is Natural number");
        }
        else {
        	System.out.println("Entered number is Integer");
        }
	

	}	
	
}
