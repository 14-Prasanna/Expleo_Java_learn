package handon;

import java.util.*;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> s = new LinkedHashSet<>(); 

        System.out.print("How many names do you want to input? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Elements in the Set : ");
            String str = sc.nextLine();
            s.add(str);
        }

 
        Iterator<String> it = s.iterator();

        String result = "";

        while (it.hasNext()) {
            String value = it.next();
            System.out.print(value + " ");
            result += value + " ";
        }

        System.out.println("\nConcatenated result: " + result.trim());

        sc.close();
    }
}