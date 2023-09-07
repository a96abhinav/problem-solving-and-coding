package com.java.practice;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class P01 {

	public static void main(String[] args) {

		Map<Integer,String> map = new TreeMap<>();
		
		map.put(1, "Abhinav");
		map.put(2, "Akash");
		map.put(3, "Abhay");
		map.put(4, "Anshul");
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		Collection<String> values = map.values();
		
		keys.forEach(System.out :: print);
		values.forEach(System.out :: print);
		
		Set<Entry<Integer, String>> entry = map.entrySet();
		
		for(Entry<Integer, String> e : entry) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		
		
	}

}
