package com.company;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1221;
        if (num == rev(num)) {
            System.out.println(num + " is a palindrome");
        } else System.out.println(num +" is not a palindrome");
    }

    static int rev(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1) + helper(n / 10, digits - 1));
    }
}
