package com.coll;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String args[]) {
		Stack<String>  st = new Stack<>();
		
		st.add("hell0");
		st.add("hgwef s");
		st.add(0, "hwrijsd ia");
		
		st.peek();
		st.push("iehf ybf");
		st.pop();
		st.push("wguf es");
		
		for(String s1:  st) {
			System.out.println(s1);
		}
		
	}

}
