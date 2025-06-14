package controlstatements;

import java.util.Scanner;

public class FindEvenOrOdd {

	public static void main(String[] args) {
		Scanner a3 = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = a3.nextInt();
		
		if (a == 0) {
			System.out.println("Zero");
		}
		else if (a%2 == 0) {
			System.out.println("This is even number");
		}
		else {
			System.out.println("This is odd number");
		}

	}

}
