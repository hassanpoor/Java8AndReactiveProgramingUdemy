package com.hossein.session8;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("fact: " + factorialRecursion(4));
        System.out.println("fact tail: " + factorialTailRecursion(4, 1));
    }

    private static int factorialRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    private static int factorialTailRecursion(int n, int a) {
        if (n <= 1) {
            return a;
        }
        return factorialTailRecursion(n - 1, n * a);
    }
}
