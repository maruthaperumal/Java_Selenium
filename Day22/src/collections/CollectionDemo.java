package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		
//		List <Integer> myList = new ArrayList<Integer>(); only integer
		
//		If we want all set of data use this syntex
		List myList = new ArrayList ();
		List <String> myList1 = new ArrayList<>();
		myList.add("Hi");
		myList.add(5);
		myList.add(1.8);
		myList.add(true);
		
		myList1.add("Sedhu");
		myList1.add("Moniesh");
		myList1.add("Mubarak");
		
		System.out.println(myList);
		System.out.println("Retreving data by using index: "+myList.get(1));
		myList.add(4, "Madhan");
		myList.addAll(myList1);
		
		System.out.println(myList1);
		System.out.println("Modified List: "+myList);
		
//		If i want to change the value
		
//		myList.set(0, "Hello");
//		System.out.println(myList);
//		
//		System.out.println("Size of the List: "+myList.size());
//		System.out.println("Is this List is Empty: "+myList.isEmpty());
//		
////		Remove value
////		
////		myList.remove(2);
////		System.out.println("Removed value using index: "+myList);
////		
//////		myList.remove("Madhan");
//////		System.out.println("Removed value using value name: "+myList);
////		
////		myList.removeAll(myList1);
////		System.out.println("Removed all value: "+myList);
//		
////			Retain all
//		
////		myList.retainAll(myList1);
////		System.out.println("Retained list: "+myList);
//		
////		Contains (To check value is present or not)
//		System.out.println("Contains value: "+myList.contains("Madhan"));
//		
////		Index of (To get index of one value)
//		System.out.println("Index of Mubarak: "+myList.indexOf("Mubarak"));
//		
////		Clear data
//		myList.clear();
//		System.out.println(myList);
//		System.out.println(myList.isEmpty());
		
//      Reading data using for loop
		System.out.println();
	    System.out.println("Reading data using for loop");
		for(int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
//      Reading data using enhanced for loop
		System.out.println();
		System.out.println("Reading data using enhanced for loop");
		for ( Object a : myList) {
			System.out.print(a+ " ");
		}
			
			
//		Reading data using iterator 
		System.out.println();
		System.out.println("Reading data using iterator");
		
		Iterator<Object> x = myList.iterator();	
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		
		

	}

}






















