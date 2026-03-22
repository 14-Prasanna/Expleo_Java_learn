package handon;

import java.util.*;

public class Problem3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> hm = new HashMap<>();

        System.out.print("String Text = ");
        String s1 = sc.nextLine();

        int i = 0;

       
        while (i < s1.length()) {

            char ch = s1.charAt(i);

            if (ch == 'a' || ch == 'c' || ch == 's' || ch == 'o') {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }

            i++; 
        }

        int counta = 0, countc = 0, counts = 0, counto = 0;

        
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {

            char key = entry.getKey();
            int value = entry.getValue();

            if (key == 'a') {
                counta = value;
            }
            if (key == 'c') {
                countc = value;
            }
            if (key == 's') {
                counts = value;
            }
            if (key == 'o') {
                counto = value;
            }
        }

        System.out.println("Character Counts: ");
        System.out.println("a: " + counta);
        System.out.println("c: " + countc);
        System.out.println("s: " + counts);
        System.out.println("o: " + counto);

        sc.close();
    }
}