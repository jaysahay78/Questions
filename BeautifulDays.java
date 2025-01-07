package com.company;
import java.lang.Math;
import java.util.Scanner;

public class BeautifulDays {
    static int rev(int n){
        int reverse = 0;
        while (n != 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return reverse;
    }

    static int BeautifulDays(int i, int j, int k){
        int beau = 0, temp;
        for (int p = i; p<= j; p++){
            temp = Math.abs((p-rev(p))%k);
        if (temp == 0){
            beau = beau +1;
        }}
        return beau;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        System.out.println(BeautifulDays(i, j, k));
    }
}
