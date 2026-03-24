package com.collections;

import java.util.Scanner;

public class P2 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s1 = sc.nextLine(); 
		
		if (s1.length() == 0) {
			System.out.println("@@");
		} 
		else if (s1.length() == 1) {
			char ch = s1.charAt(0);
			if (Character.isAlphabetic(ch)) {
				System.out.println(ch + "@");
			} else {
				System.out.println("@@");
			}
		} 
		else {
			String result = "";
			
			for (int i = 0; i < 2; i++) {
				char ch = s1.charAt(i);
				if (Character.isAlphabetic(ch)) {
					result += ch;
				} else {
					result += "@";
				}
			}
			
			System.out.println(result);
		}
		
		sc.close();
	}
}