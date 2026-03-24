package com.collections;

import java.io.*;
import java.util.*;

public class P1 {

    public static void main(String args[]) throws IOException {

        
    
        FileOutputStream out = new FileOutputStream("words.txt");
        
    	

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s1 = sc.nextLine();

        out.write(s1.getBytes());
        out.close();

        System.out.println("Data written to file successfully.");

        
        Map<String, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        try 
        {
        	FileInputStream in = new FileInputStream("word.txt");
        


       
        	int ch;

        	while ((ch = in.read()) != -1) 
        	{
        		sb.append((char) ch);
        	}

        	in.close();
        	
        	 String[] words = sb.toString().split("\\s+");

             
             for (String word : words) {
                 hm.put(word, hm.getOrDefault(word, 0) + 1);
             }

             
             System.out.println("Word Frequency:");
             for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                 System.out.println(entry.getKey() + " = " + entry.getValue());
             }


        }
        
        catch(Exception e) {
        	System.out.println("Error: words.txt not found");
        }
             
        sc.close();
    }
}