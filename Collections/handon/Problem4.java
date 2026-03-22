package handon;

import java.util.*;

public class Problem4 {

    // Push names with marks > 75
    public static Stack<String> pushToStack(HashMap<String, Integer> map) {
        Stack<String> stack = new Stack<>();

        for (String name : map.keySet()) {
            if (map.get(name) > 75) {
                stack.push(name);
            }
        }

        return stack;
    }

    // Pop and display stack
    public static void popStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); 

            map.put(name, marks);
        }

        System.out.println("\nStudent Marks in the HashMap: " + map);

        Stack<String> stack = pushToStack(map);

        System.out.println("Student Marks above 75 in the stack:");
        popStack(stack);

        sc.close();
    }
}