package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Tamil", 85);
		map.put("English", 95);
		map.put("Maths", 90);
		map.put("Science", null);
		map.put(null, null); // in hashtable both key and value ignore the null
		map.put(null, 100);
		
		System.out.println(map);
		
//		System.out.println("length of the Map: "+map.size());
		
//		remove key
		
//	map.remove(null);
//	System.out.println("After removing the key: "+map);
//	
////	Get
//	System.out.println(map.get("Tamil"));
//	
////	Keyset
//	System.out.println("Keys: "+map.keySet());
//	
////	Value
//	System.out.println("Values: "+map.values());
//	
////	EntrySet
//	System.out.println("EntrySet: "+map.entrySet());
//	
////	Contain key
//	System.out.println("Is Science in Map: "+map.containsKey("Science"));
//	
////	Contain value
//	System.out.println("Is 100 in Map: "+map.containsValue(100));
//	
////	clear
//	map.clear();
//	System.out.println(map);
//	
////	Is empty
//	System.out.println("Is Empty: "+map.isEmpty());
		
//		Reading data using for each loop
		System.out.println();
		for (Object a : map.keySet()) {
			System.out.println(a+ " " +map.get(a));
			
		}
		
//		Reading data using iterator 
		System.out.println();
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Entry<String,Integer> entry = it.next();
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		

	}

}






















