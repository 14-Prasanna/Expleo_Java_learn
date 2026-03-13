package com.handOn;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoFile {

    public static void main(String[] args) {

        Path p1 = Paths.get("D:/archive/Finance_data.txt");
        Path p2 = p1.subpath(1, 2);

        System.out.println("P1: " + p1);
        System.out.println("Subpath: " + p2);
        
        
        FileSystem fs= FileSystems.getDefault();
        Path p5 = fs.getPath("D:/archive/Finance_data.txt");
        
        System.out.println(fs + "\t" + p5);

    }
}