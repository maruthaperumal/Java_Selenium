package controlstatements;

import java.util.Scanner;

public class WeekNameAsPerWeekNumber {

	public static void main(String[] args) {
		Scanner a1 = new Scanner(System.in);
		System.out.println("Enter the week days number");
		int w = a1.nextInt();
		
		switch (w) {
		case (1): System.out.println("Sunday"); break;
		case (2): System.out.println("Monday"); break;
		case (3): System.out.println("Tuesday"); break;
		case (4): System.out.println("Wednesday"); break;
		case (5): System.out.println("Thursday"); break;
		case (6): System.out.println("Friday"); break;
		case (7): System.out.println("Saturday"); break;
		default : System.out.println("OOPS! Something went wrong!");
		}

	}

}
