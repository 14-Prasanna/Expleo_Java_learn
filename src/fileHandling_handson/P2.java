package fileHandling_handson;

import java.io.*;

public class P2{
    public static void main(String[] args){

        File f = new File(".");

        File[] a = f.listFiles();

        for(File b : a){
            if(b.getName().endsWith(".txt")){
                System.out.println(b.getName());
            }
        }
    }
}