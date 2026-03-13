package com.generic;
import java.util.*;

class Demo<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo<Integer> obj = new Demo<Integer>();
		obj.set(25);
		System.out.println(obj.get());
		
		Demo<String> obj1 = new Demo<>();
		obj1.set("hello");
		System.out.println(obj1.get());

	}

}
