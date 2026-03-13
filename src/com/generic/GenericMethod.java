package com.generic;

public class GenericMethod {
	
	static<T> void Display(T element) {
		System.out.println(element);
		System.out.println(element.getClass().getName() + " = " + element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display(11);
		Display("Hello");
		Display(1.0);

	}

}
