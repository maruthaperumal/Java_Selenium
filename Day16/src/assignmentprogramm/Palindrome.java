package assignmentprogramm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int a = num;
		int i, revNum = 0;
		while (a>0) {
			i=a%10;
			revNum = i+(revNum*10);
			a=a/10;
		}
		System.out.println("Reversed Number is " +revNum);
		if (revNum == num) {
			System.out.println("Entered number is a Palindrome");
			}
		else {
			System.out.println("Entered number is not a Palindrome");
				
		}

	}

}
