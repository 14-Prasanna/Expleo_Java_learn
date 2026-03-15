package com.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
	
	public static void main(String args[]) {
		List<Float> ints = new ArrayList<>();
		ints.add((float) 3);
		ints.add((float) 5.0);
		ints.add((float) -50);
		
		sum(ints);
		
	}
	
	public static void sum(List<?> list) {
		
		for(Object n : list) {
			System.out.println(n);
		}
		
	}
			

}
