package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayinp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
                System.out.print("hello");
            }
        }
        //1st method
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //2nd method
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println();

        //3rd method
         for (int[] a : arr) {

        System.out.println(Arrays.toString(a));
         }
        }
    }