package com.coll;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> np = new ArrayList<>();
		
		System.out.println("Initial array size: " + np.size());
		np.add(1);
		np.add(2);
		np.add(1, 5);
		
		for(Integer A1: np) {
			System.out.print(A1 + " ");}
	

		System.out.println("Converting toArray");
		Object[] arr = np.toArray();
		
		
		for(Object A: arr) {
		System.out.print(A);
		}
		
		
	}

}
