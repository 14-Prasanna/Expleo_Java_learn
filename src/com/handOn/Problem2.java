package com.handOn;

import java.util.Scanner;

public class Problem2 {
	
	public static String removeWhitespace(String str) {
	   
	    int start = 0;
	    int end = str.length() - 1;

	   
	    while (start <= end && Character.isWhitespace(str.charAt(start))) {
	        start++;
	    }

	  
	    while (end >= start && Character.isWhitespace(str.charAt(end))) {
	        end--;
	    }

	  
	    return str.substring(start, end + 1);
	}   
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		
		System.out.println("Removed White Space: " + removeWhitespace(s1));
		
		sc.close();
	}

}
