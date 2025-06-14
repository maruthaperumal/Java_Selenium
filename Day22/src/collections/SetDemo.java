package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
	Set <Object> myset = new LinkedHashSet<Object>();
	
	
	myset.add(50);
	myset.add(20);
	myset.add(30);
	myset.add(10);
	
	System.out.println(myset);
	
	
	Set <String> myset1 = new TreeSet<String>();
	myset1.add("Sedhu");
	myset1.add("Madhan");
	myset1.add("Moniesh");
	myset1.add("Mubarak");
	
	System.out.println(myset1);
	
	myset.addAll(myset1);
	System.out.println(myset);
	
//	myset.addAll(myset1);
	
	
	
//	remove
//	System.out.println();
//	myset.remove(20);
//	System.out.println("Using remove method to remove value 20: "+myset);
	
//	Size
//	System.out.println();
//	System.out.println("Lenght of set: "+myset.size());
//	
////	Clear
//	System.out.println();
//	myset.clear();
//	System.out.println("Cleared set: "+myset);
//	System.out.println("Is Empty: "+myset.isEmpty());
	
//	Reading data from set
//	System.out.println();
//	System.out.println("Converting into list");
//	List <Integer> mylist = new ArrayList (myset);
//	System.out.println("Index value: "+mylist.get(1));
	
////	Reading data using for is cannot be used for set
//	
////	Reading data using enhanced for loop
//	System.out.println();
//	System.out.println("Reading data using enhanced for loop");
//	for (Object x : mylist) {
//		System.out.println(x);
	}
		
//		
////		Reading data using iterator
//		System.out.println();
//		System.out.println("Reading data using iterator");
//		Iterator <Integer> a = mylist.iterator();
//		while (a.hasNext()) {
//			System.out.println(a.next());	
//		}
		
	
//	}

}
