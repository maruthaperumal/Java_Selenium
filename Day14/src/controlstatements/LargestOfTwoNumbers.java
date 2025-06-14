package controlstatements;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
	Scanner a4 = new Scanner(System.in);
	System.out.println("Enter a value of A");
	int a = a4.nextInt();
	
	System.out.println("Enter a value of B ");
	int b = a4.nextInt();
	
	if (a>b) {
		System.out.println("The Largest number is: "+ a);
	}
	else if (a<b) {
		System.out.println("The Largest number is: "+b);
	}
	else {
		System.out.println("Entered two numbers are equal");
	}

	}

}
