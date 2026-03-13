package com.handOn;

import java.util.Scanner;

public class Problem3 {
	
	public static boolean localEmail(String s1) {

    if(!s1.matches("[a-z0-9]+.*")) {
        return false;
    }

    if(!s1.matches(".*[0-9]+.*")) {
        return false;
    }

    for(int i = 0; i < s1.length()-1; i++) {
        if((s1.charAt(i) == '-' && s1.charAt(i+1) == '-') ||
           (s1.charAt(i) == '_' && s1.charAt(i+1) == '_') ||
           (s1.charAt(i) == '.' && s1.charAt(i+1) == '.')) {
            return false;
        }
    }

    if(s1.endsWith(".") || s1.endsWith("/") || s1.endsWith("_") || s1.endsWith("-")) {
        return false;
    }

    return true;
}
	
	public static boolean domain(String s1) {
		
		int index = 0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) == '@') {
				index = i+1;
				break;
			}
		}
		
		if(index == 0) {
			return false;
		}

		if(!s1.contains(".")) {
			return false;
		}
		
		for(int i=index;i<s1.length()-1;i++) {
			if(s1.charAt(i) == '.') {
				if(s1.charAt(i) == s1.charAt(i+1)) {
					return false;
				}
			}
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("The email validation");
		
		String s1 = sc.next();
		
		int atIndex = s1.indexOf('@');

		if(atIndex == -1) {
			System.out.println("nooo");
		}
		else {
			String local = s1.substring(0, atIndex);

			if(localEmail(local)) {
				if(domain(s1)) {
					System.out.println("Correct email");
				}
				else {
					System.out.println("Invalid email");
				}
			}
			else {
				System.out.println("Invalid email");
			}
		}
		
		sc.close();
	}
}