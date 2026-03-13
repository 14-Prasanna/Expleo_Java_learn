package com.handOn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFileDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path source = Paths.get("D:/archive/Finance_data.txt");
		Path target = Paths.get("D:/archive/Finance_data.txt");
		
		try {
			System.out.println(source + " " + "Copied to: " + " " + Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING));
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
