package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] ros = new String[5]; /*declaration of array is defined as heap memory, heap objects are not continuous,
        int[] ros is initiated at run time while new int[5] is initiated at runtime(this
        is known as dynamic memory allocation)*/
        for (int i=0; i< ros.length; i++) {
        ros[i] = in.next();
        }
        System.out.println(Arrays.toString(ros));

    }
}