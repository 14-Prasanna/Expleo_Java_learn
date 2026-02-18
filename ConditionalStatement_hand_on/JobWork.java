package ConditionalStatement_hand_on;

import java.util.Scanner;

public class JobWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pages typed: ");
        int pages = sc.nextInt();

        System.out.print("Enter number of copies printed: ");
        int copies = sc.nextInt();

        int typingCost = pages * 3;

        int printingCost = 0;

        if(copies >= 1){
            printingCost = pages * 1;  
            if(copies > 1){
                printingCost += (copies - 1) * pages * 3;
            }
        }

        int total = typingCost + printingCost;

        System.out.println("Total Bill: Rs. " + total);

	}

}
