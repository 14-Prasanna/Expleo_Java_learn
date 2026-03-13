package com.generic;

class Test<S,U,V>{
	
	S a;
	U b;
	V c;
	
	Test(S a, U b, V c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class AllinOne {

	public static void main(String[] args) {
		
		Test<Integer, Double, String> obj = new Test<>(1, 67.00, "Prasanna");
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);

	}
}