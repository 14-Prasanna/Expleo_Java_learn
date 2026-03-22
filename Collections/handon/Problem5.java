package handon;

import java.util.*;

public class Problem5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        TreeSet<Integer> set = new TreeSet<>();

        
        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            int num = Integer.parseInt(input);
            set.add(num);
        }

        
        System.out.println("Sorted unique numbers: " + set);

        // Convert to list for processing
        List<Integer> list = new ArrayList<>(set);

        // Average
        double sum = 0;
        for (int n : list) {
            sum += n;
        }
        double avg = sum / list.size();
        System.out.println("Average: " + avg);

        // Lowest & Highest
        System.out.println("Lowest: " + set.first());
        System.out.println("Highest: " + set.last());

        // Filter odd numbers
        List<Integer> oddList = new ArrayList<>();
        for (int n : list) {
            if (n % 2 != 0) {
                oddList.add(n);
            }
        }

        System.out.println("Odd numbers: " + oddList);

        sc.close();
    }
}