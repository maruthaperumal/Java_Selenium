package array;

import java.util.Arrays;

public class TwoDimensional {

	public static void main(String[] args) {
		int [][]a = new int [4][3];
		
		a [0][0] = 1;
		a [0][1] = 6;
		a [0][2] = 8;
		a [1][0] = 9;
		a [1][1] = 4;
		a [1][2] = 20;
		a [2][0] = 17;
		a [2][1] = 14;
		a [2][2] = 18;
		a [3][0] = 24;
		a [3][1] = 30;
		a [3][2] = 3;
		
		System.out.println("Called single value is: " +a[1][2]);
		System.out.println("Length of row is: " +a.length);
		System.out.println("Length of column is: " +a[1].length);
		
		
		System.out.println();
		System.out.println("Finding the multiple value of array");
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println();
		System.out.println("Using Arrays class");
		System.out.println(Arrays.toString(a[1]));
		
		System.out.println();
		System.out.println("Sorting using Arrays class");
		Arrays.sort(a[1]);
		System.out.println(Arrays.toString(a[1]));
	}

}
