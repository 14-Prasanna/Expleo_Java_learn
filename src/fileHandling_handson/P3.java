package fileHandling_handson;

import java.io.*;

public class P3{
    public static void main(String[] args){

        File f = new File("demo.txt");

        if(f.exists()){
            System.out.println("File exists");
        }
        else{
            System.out.println("File not found");
        }
    }
}