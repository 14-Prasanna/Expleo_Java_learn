package ConditionalStatement_hand_on;

import java.util.*;

public class SecondsInWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int secondsPerDay = 86400;
        int totalSeconds = days * secondsPerDay;

        System.out.println("Total seconds: " + totalSeconds);
    }
}
