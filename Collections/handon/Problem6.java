package handon;

import java.util.*;

class Person implements Comparable<Person> {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person p) {
        return this.firstName.compareTo(p.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Problem6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<>();

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter first name: ");
            String fn = sc.nextLine();

            System.out.print("Enter last name: ");
            String ln = sc.nextLine();

            list.add(new Person(fn, ln));
        }

        Collections.sort(list);

        System.out.println("\nSorted people by first name:");
        for (Person p : list) {
            System.out.println(p);
        }

        sc.close();
    }
}