package com.exceptionhandling;

import java.util.Scanner;

class Solution {

    long power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }

        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);
    }
}

public class MyCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution my_calculator = new Solution();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
        sc.close();
    }
}