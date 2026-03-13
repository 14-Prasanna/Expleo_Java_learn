package com.handOn;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SoftLink {

	
	public static void main(String args[]) {
		
		try {
			Path p1 = Paths.get("D:/archive/Finance_data.csv");
			Boolean result = Files.isReadable(p1);
			
			Path p2 = Paths.get("D:/archive/Demo.txt");
			Path p = Files.createFile(p2);
			System.out.println(result);
			System.out.println("File Created at path " + p);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
