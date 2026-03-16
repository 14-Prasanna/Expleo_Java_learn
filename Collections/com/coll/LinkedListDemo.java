package com.coll;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l1 = new LinkedList<>();
		
		
		l1.add("HELLO");
		l1.add("GM");
		l1.add("C++");
		
		System.out.println(l1);
		
		l1.clear();
		System.out.println(l1);
		

		l1.add("HELLO");
		l1.add("GM");
		l1.add("C++");
		
		l1.clone();
		System.out.println(l1);
		
		System.out.println(l1.contains("C++"));
		
		l1.add("Byeee................");
		
		System.out.println(l1.getLast());

	}

}
