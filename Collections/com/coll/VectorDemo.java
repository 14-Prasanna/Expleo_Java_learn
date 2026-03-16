package com.coll;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> v1 = new Vector<>(5, 8);
		
		System.out.println(v1.capacity());
		
		
		
		for(int i=0;i<5;i++) {
			System.out.println("current capatiy: " + v1.capacity());
			System.out.println(v1.add(i) + " Adding ");
		}
		
		
		v1.add(11);
		System.out.println(v1.capacity());
		for(int i=0;i<10;i++) {
			v1.add(i);
		}
		
		System.out.println(v1.capacity());

	}

}
