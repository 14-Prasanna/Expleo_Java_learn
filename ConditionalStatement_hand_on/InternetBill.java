package ConditionalStatement_hand_on;

import java.util.*;

public class InternetBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours used: ");
        int hours = sc.nextInt();

        if(hours > 7){
            System.out.println("Maximum browsing limit is 7 hours");
            return;
        }

        System.out.print("Enter minutes used: ");
        int minutes = sc.nextInt();

        int totalMinutes = hours * 60 + minutes;
        int total = 0;

        if(hours == 5 && minutes == 0){
            total = 200;
        }
        else if(hours == 1 && minutes == 0){
            total = 50;
        }
        else{
            total = totalMinutes * 1; 
        }
        
        System.out.println("Total Bill: Rs. " + total);


	}

}
