package assignmentprogramm;

		import java.util.Scanner;     // Took from chatGPT

		public class ArmstrongNumber {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        if (isArmstrong(number)) {
		            System.out.println(number + " is an Armstrong number.");
		        } else {
		            System.out.println(number + " is not an Armstrong number.");
		        }
		        
		        scanner.close();
		    }

		    
		    public static boolean isArmstrong(int num) {
		        int originalNumber = num;
		        int sum = 0;
		        int numberOfDigits = String.valueOf(num).length(); 

		       
		        while (num != 0) {
		            int digit = num % 10;
		            sum += Math.pow(digit, numberOfDigits);
		            num /= 10;
		        }

		        
		        return sum == originalNumber;
		    }
		


	}


