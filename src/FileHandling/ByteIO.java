package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class ByteIO {

    public static void main(String[] args) {

        byte[] b = new byte[128];

        try (
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output1.txt")
        ) {

            System.out.println("Bytes available: " + fis.available());

            int count = 0;
            int read = 0;

            while ((read = fis.read(b)) != -1) {
                fos.write(b, 0, read);
                count += read;
            }

            System.out.println("Total Count: " + count);

        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}