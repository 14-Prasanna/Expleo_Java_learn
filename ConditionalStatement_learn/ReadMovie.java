package ConditionalStatement_learn;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class ReadMovie {

	public static void main(String args[]) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Movie ID:");
		int id = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter the Movie Name:");
		String s = sc.nextLine();
		
		System.out.println("Enter the Movie Description");
		String des = sc.nextLine();
		
		System.out.println("Enter the Language");
		String la = sc.next();
		
		System.out.println("Enter the Genere");
		String gs = sc.next();
		
		System.out.println("Enter the Movie release date (dd/mm/yyyy)");
		String date = sc.next();
		SimpleDateFormat dat = new SimpleDateFormat("dd/MM/yyyy");
		Date mdate  = dat.parse(date);
		
		System.out.println("Enter the seat cost");
		float rate = sc.nextFloat();
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("ENTERED MOVIE DETAILS");
		System.out.println("The Movie ID: " + id);
		System.out.println("The Movie Name: " + s);
		System.out.println("The Movie Description: " + des);
		System.out.println("The Language: " + la);
		System.out.println("The Genere: " + gs);
		System.out.println("The Movie release date: " + mdate);
		System.out.println("The Movie cost: " + rate);
		
		
		sc.close();
	}
}
