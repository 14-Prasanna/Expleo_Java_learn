package fileHandling_handson;

import java.io.*;
import java.util.*;

public class P4{
    public static void main(String[] args){

        File f = new File("demo.txt");

        long a = f.lastModified();

        Date d = new Date(a);

        System.out.println("Last Modified: " + d);
    }
}