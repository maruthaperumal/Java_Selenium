package org.day6;

public class Overloading {   //method overloading
	// Practice 1
	
	private void schooldetails(String name){
	System.out.println("School Name:" +" "+name);	
	}
	
	private void schooldetails(String myname, char myinitial){
		System.out.println("Name:" +" "+myname +" "+myinitial);
	}
		
    private void schooldetails(int mystd, char mysec){
			System.out.println("Standard:" +" "+mystd +" "+ mysec);	
    }
    private void schooldetails(int num, char c, String area, String city, int pincode){
		System.out.println("Address:" +" "+num +" "+c +" "+area +" "+city +" "+pincode);	
    

	}


	public static void main(String[] args) {
	Overloading obj = new Overloading();
	obj.schooldetails("KMHSS");
	obj.schooldetails("MARUTHA PERUMAL", 'M');
	obj.schooldetails(12, 'B');
	obj.schooldetails(1, 'a', "Annanur", "Chennai", 600064);
	}
	
	
	
	
	// Practice 2
	
//	static int max(int a, int b) {
//	    return a>b?a:b;
//	    }
//	
//	static double max(double a, double b) {
//		return a>b?a:b;
//		}
//	
//	public static void main(String[] args) {
//		System.out.println(max(1,2));
//		System.out.println(max(2.5,3.5));
//	}

}























