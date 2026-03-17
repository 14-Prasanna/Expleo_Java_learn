package com.coll;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<>();
		
		
		for(int i=0;i<5;i++) {
			arr.add(i);
		}
		
		Spliterator<Integer> st = arr.spliterator();
		while(st.tryAdvance((n)-> System.out.print(n + " ")));
		System.out.println();
		
		st = arr.spliterator();
		st.forEachRemaining((n)-> System.out.print(n + " "));
		System.out.println();
		System.out.println(arr.size());

	}

}
