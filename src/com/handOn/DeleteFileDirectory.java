package com.handOn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFileDirectory {
	
	public static void main(String args[]) {
		
		Path path = Paths.get("D:/archive/Demo.txt");
		
		try {
			Files.deleteIfExists(path);
		}
		catch(NoSuchFileException e) {
			System.out.println("No such file...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("deleted successfully");
	}

}
