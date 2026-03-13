package com.handOn;

import java.util.*;

public class Problem5 {
	
	public static String pass(String s2) {
		s2 = s2.replaceAll(".", "*");
		
		return s2;
	}
	
	public static String ip(String  s3) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s3.length();i++) {
			if(s3.charAt(i) == '.') {
				sb.append(s3.charAt(i));
			}
			else {
				sb.append("x");
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User name");
		String s1 = sc.next();
		
		System.out.println("Enter the password");
		String s2 = sc.next();
		
		System.out.println("Enter the IP");
		String s3 = sc.next();
		
		System.out.println("Enter the Status");
		String s4 = sc.next();
		
		System.out.println("User name:  " + s1);
		System.out.println("Password:   " + pass(s2));
		System.out.println("IP:         " + ip(s3));
		System.out.println("Status:     " + s4);
		
		sc.close();
	}

}
