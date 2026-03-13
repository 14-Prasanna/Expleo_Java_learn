package com.handOn;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path p1= Paths.get("D:/archive/Finance_data.txt");
		Path normalizePath = p1.normalize();
		
		Path p2 = Paths.get("D:/archive/data/hello.txt");
		System.out.println("Normalize Path: " + normalizePath);	
		
		Path subPath = p1.subpath(1, 2);
		System.out.println("Compare: " + p1.compareTo(p2));
		System.out.println("Sub path: " + subPath);
		
		System.out.println("GetFileName: " + p1.getFileName());
		System.out.println("getParent: " + p1.getParent());
		System.out.println("GetCOunt: " + p1.getNameCount());
		System.out.println("GetRoot: " + p1.getRoot());
		System.out.println("isAbsolute: " + p1.isAbsolute());
		System.out.println("toAbsolute: " + p1.toAbsolutePath());
		
		System.out.println("toURL: " + p1.toUri());
		if(p1.equals(p2)) {
			System.out.print("Both are equal");
		}
		else {
			System.out.println("NOOOO");
		}

	}

}
