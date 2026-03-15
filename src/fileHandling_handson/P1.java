package fileHandling_handson;

import java.io.*;
import java.util.*;

public class P1{
    public static void main(String[] args) throws Exception{

        File f = new File("demo.txt");
        Scanner sc = new Scanner(f);

        String a = "";
        String b = "";

        while(sc.hasNext()){
            a = sc.next();
            if(a.length() > b.length()){
                b = a;
            }
        }

        System.out.println("Longest word: " + b);
    }
}