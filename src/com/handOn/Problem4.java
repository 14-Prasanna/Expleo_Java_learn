package com.handOn;

import java.util.*;

public class Problem4 {
	
	public static void replace(String s1) {
	    StringBuilder s2 = new StringBuilder();

	    for(int i = 0; i < s1.length(); i++) {
	        char ch = s1.charAt(i);
	        
	        if(ch == 'X' || ch == 'Y' || ch == 'Z' || ch == 'x' || ch == 'y' || ch == 'z') {
	        	s2.append((char) (ch - 23));
	        }
	        else {

	        if(Character.isLetter(ch)) {
	            s2.append((char)(ch + 3));
	        } 
	        else if(ch == ' ') {
	            s2.append("_");
	        } 
	        else {
	            s2.append(ch);
	        }
	        }
	    }

	    System.out.println("The replace String: " + s2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		
		replace(s1);
		
		
		sc.close();

	}

}
