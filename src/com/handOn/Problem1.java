package com.handOn;

import java.util.*;

public class Problem1 {
	
	public static String removeDupli(String s1) {
		
		String s3 = "";
		
		for(int i=0;i<s1.length();i++) {
			if(!s3.contains((String.valueOf(s1.charAt(i))))) {
				s3 +=s1.charAt(i);
			}
		}
		
		return s3.toString();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1 = sc.nextLine().toLowerCase();
		
		String s2 = removeDupli(s1);
		
		System.out.println("The removed Duplicate Charaters: " + s2);
		
		sc.close();
	}

}
