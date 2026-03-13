package com.handOn;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {
	
	public static void main(String args[]) {
		
		try {
			Path path = Paths.get("F:/personal/Sample");
			if(!Files.exists(path)) {
				Files.createDirectories(path);
				System.out.println("Directory created");
			}
			else {
				System.out.println("Directory already exit");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
