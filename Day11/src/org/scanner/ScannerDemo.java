package org.scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	Scanner scd = new Scanner(System.in);
    System.out.println("Say Hi");
    String Hi = scd.nextLine();
    
    System.out.println("What's your name");
    String name = scd.nextLine();
//    scd.nextLine();
    
    System.out.println("How may I help you");
    String help = scd.nextLine();
    
   
   System.out.println("Hi");
   System.out.println("Hello "+name);
   System.out.println("Mahatma Gandhi");
   

   
	}

}
