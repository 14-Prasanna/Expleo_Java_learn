package FileHandling;

import java.io.FileOutputStream;

public class FileWriteExample {

    public static void main(String[] args) {

        String data = "Welcome to Java Portal!!! Have a Happy Learning";

        try {

            FileOutputStream out = new FileOutputStream("Output.txt");

            byte[] a = data.getBytes();

            out.write(a);

            out.close();

            System.out.println("Data written to file successfully.");

        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}