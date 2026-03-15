package fileHandling_handson;

import java.io.*;
import java.nio.file.*;

public class RoseFileApp {
	
    public static void main(String[] args) {
    	
    	 try {

             File f = new File("expenditure_jan.txt");

            
             if (f.exists()) {
                 System.out.println("File exists");

                 
                 System.out.println("File path: " + f.getAbsolutePath());

                 
                 if (f.canRead() && f.canWrite()) {
                     System.out.println("File is readable and writable");
                 }

             } else {
                 System.out.println("File not found");
             }

             
             Path target = Paths.get("expenditure_jan.txt");
             Path link = Paths.get("expenditure_link.txt");

             if (!Files.exists(link)) {
                 Files.createSymbolicLink(link, target);
                 System.out.println("Soft link created");
             }

          
             FileWriter fw = new FileWriter("expenditure_jan.txt", true);
             fw.write("\nShopping: 2000");
             fw.write("\nMedical: 500");
             fw.close();

             System.out.println("Details added");

            
             Path source = Paths.get("expenditure_jan.txt");
             Path dest = Paths.get("old/expenditure_jan.txt");

             Files.createDirectories(Paths.get("old"));
             Files.move(source, dest, StandardCopyOption.REPLACE_EXISTING);

             System.out.println("File moved to old folder");

             
             File newFile = new File("expenditure_feb.txt");
             
             
             if (newFile.createNewFile()) {

                 FileWriter fw2 = new FileWriter(newFile);

                 fw2.write("Month: February\n");
                 fw2.write("Food: \n");
                 fw2.write("Transport: \n");
                 fw2.write("Groceries: \n");
                 fw2.write("Electricity Bill: \n");
                 fw2.write("Internet: \n");
                 fw2.write("Miscellaneous: \n");

                 fw2.close();

                 System.out.println("New month file created");
             }

         } catch (Exception e) {
             System.out.println(e);
         }
     }


    }
