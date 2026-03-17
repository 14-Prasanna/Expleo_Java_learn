package com.coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String args[]) {
		
		Map<String, Double> mp = new HashMap<>();
		
		System.out.println(mp.size());
		
		mp.put("Prasanna", 200.00);
		mp.put("Deepak", 100.00);
		mp.put("venkatesh", 10000.00);
		
		System.out.println(mp);
		
		Set<Map.Entry<String, Double>> set = mp.entrySet();
		for(Entry<String, Double> a : set) {
			System.out.print(a.getKey() + ": ");
			System.out.print(a.getValue()+ " ");
			
		}
		
	}
}
