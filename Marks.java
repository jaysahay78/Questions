package com.company;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("enter maths marks: ");
        int maths = num.nextInt();
        System.out.print("enter english marks: ");
        int english = num.nextInt();
        System.out.print("enter science marks: ");
        int science = num.nextInt();
        System.out.print("enter sst marks: ");
        int sst = num.nextInt();
        System.out.print("enter hindi marks: ");
        int hindi = num.nextInt();
        int perc = (maths + english +science + sst + hindi)/5;
        System.out.println(perc);
    }
}
