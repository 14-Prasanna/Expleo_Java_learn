package com.string;

import java.lang.*;

public class StringExample {

	public static String concat(String s1) {
		s1 = s1 + "Ram";
		return s1;
	}
	
	public static void concat2(StringBuilder s2) {
		s2.append("raj");
	}
	
	public static void concat3(StringBuffer s3) {
		s3.append("Ravi");
	}
	
	public static void main(String args[]) {
		String s1 = "Hello, ";
		s1 = concat(s1);
		
		System.out.println("String: " + s1);
		
		StringBuilder s2 = new StringBuilder("Hello, ");
		concat2(s2);
		System.out.println("StringBuilder: " + s2);
		
		StringBuffer s3 = new StringBuffer("Hello, ");
		concat3(s3);
		System.out.println("String Buffer: " + s3);
		
		
	}
	
}
