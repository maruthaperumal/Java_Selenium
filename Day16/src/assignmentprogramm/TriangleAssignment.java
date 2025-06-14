package assignmentprogramm;

public class TriangleAssignment {

	public static void main(String[] args) {
		for ( int row =1; row<=5; row++) {    // row
			for (int col=1; col<=8; col++) {  // column
				System.out.print("* ");
		}
		System.out.println();
		}
		System.out.println();
		
		for ( int i =1; i<=3; i++) {    
			for (int j=1; j<=i; j++) {  
				System.out.print("* ");
	    }
		System.out.println();
		}
		System.out.println();
		
		for ( int i =1; i<=3; i++) {    
			for (int j=i; j<=3; j++) {  
				System.out.print("* ");
		}
		System.out.println();
		}
		
		System.out.println();
		
		for ( int i =1; i<=3; i++) {    
			for (int j=1; j<=i; j++) {  
				System.out.print(j+ " ");
	    }
		System.out.println();
        }
		System.out.println();
		
		for ( int i =1; i<=3; i++) {    
			for (int j=i; j<=3; j++) {  
				System.out.print(j+ " ");
	    }
	    System.out.println();
        }
        System.out.println();
		
		for ( int i =1; i<=3; i++) {    
			for (int j=1; j<=i; j++) {  
				System.out.print(i+ " ");
	    }
		System.out.println();
	    }
        System.out.println();
	    
}
}















