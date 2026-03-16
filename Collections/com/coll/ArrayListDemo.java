package com.coll;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> np = new ArrayList<String>();
		
		System.out.println(np.size());
		np.add("C");
		np.add("B");
		np.add(1, "Hello");
		
		for(int i=0;i<np.size();i++) {
			System.out.println(np.get(i));
		}

	}

}
