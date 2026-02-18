package methods_hand_on;

import java.util.Scanner;

public class XYXZ_College {

    public static int highDept(int cse, int ece, int me) {

    	if (cse < 0 || ece < 0 || me < 0) {
            return -1;  
        }

        if (cse == ece && ece == me) {
            return 0;  
        }

        return Math.max(cse, Math.max(ece, me));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of students placed in CS:");
        int c = sc.nextInt();

        System.out.println("Enter the no of students placed in EC:");
        int e = sc.nextInt();

        System.out.println("Enter the no of students placed in ME:");
        int m = sc.nextInt();

        int result = highDept(c, e, m);

        if (result == -1) {
            System.out.println("Input is Invalid");
        }
        else if (result == 0) {
            System.out.println("None of the department has got the highest placement");
        }
        else {
            System.out.print("Highest placement ");

            if (c == result) {
                System.out.print("CS ");
            }
            if (e == result) {
                System.out.print("EC ");
            }
            if (m == result) {
                System.out.print("ME ");
            }
        }
        sc.close();
    }
}
