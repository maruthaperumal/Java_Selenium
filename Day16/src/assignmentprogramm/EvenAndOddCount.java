package assignmentprogramm;

public class EvenAndOddCount {

	public static void main(String[] args) {
		int num = 0;
		for (int i=1; i<=100; i++) {
			if (i%2 == 0) {
		    num ++;
			}
		}
		System.out.println("Count of Even number is: " +num);

	int count = 0;
	for (int i=1; i<=100; i++) {
		if (i%2 == 1) {
	    count ++;
		}

    }
	System.out.println("Count of Odd number is: " +count);
	}
} 
