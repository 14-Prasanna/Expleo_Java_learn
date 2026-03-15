package fileHandling_handson;

import java.io.*;

public class P5{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new FileReader("demo.txt"));

        String a = "";
        String b = "";

        while((a = br.readLine()) != null){
            b = b + a;
        }

        System.out.println("File Content:");
        System.out.println(b);

        br.close();
    }
}