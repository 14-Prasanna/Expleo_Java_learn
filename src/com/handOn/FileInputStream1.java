package com.handOn;

import java.io.FileInputStream;

public class FileInputStream1 {

    public static void main(String[] args) {
        
        try {
            FileInputStream input = new FileInputStream("D:/archive/Finance_data.csv");
            System.out.println("Data in the file");

            int i = input.read();
            while(i != -1) {
                System.out.print((char)i);
                i = input.read();
            }

            input.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}