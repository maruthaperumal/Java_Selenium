package controlstatements;

import java.util.Scanner;

public class CheckEligibleForVote {

	public static void main(String[] args) {
		Scanner a2 = new Scanner(System.in);
		System.out.println("Eligibility Check");
		
		System.out.println("Enter your name:");
		String name = a2.nextLine();
		
		System.out.println("Nationality:");
		String country = a2.nextLine();
		
		System.out.println("Enter your age:");
		int age = a2.nextInt();
			
	if (age>=18) {
		System.out.println("Result: Your eligible to vote.");
	}
	else {
		System.out.println("Result: Your not eligible to vote.");
	}

	}

}
