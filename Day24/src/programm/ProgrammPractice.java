package programm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ProgrammPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String a = sc.nextLine();
		String [] words = a.split(" ");
		
		
		Map<String,Integer> map = new LinkedHashMap<String, Integer> ();
		for (String word : words) {
			if(map.containsKey(word)) {
				Integer value = map.get(word);
				map.put(word, map.get(word)+1);
			}
			else {
				map.put(word,1);
			}
			
		}
		System.out.println(map);
		
		Set<Entry<String, Integer> > entry = map.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			if(entry2.getValue() >1) {
				System.out.println(entry2.getKey());
			}
			
		}
		
	}

}
