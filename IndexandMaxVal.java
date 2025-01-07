package com.company;

import java.util.*;

public class IndexandMaxVal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            long a = 0;
            for (int i = 0; i < n; i++) {
                a = Math.max(a, sc.nextInt());
            }                                 //don't need to create an array, jus take maximum of
            StringBuilder sb = new StringBuilder(""); //the int you get from sc.nextint and add or subtract 1 from it.
            for (int i = 0; i < m; i++) {
                char c = sc.next().charAt(0);
                int l = sc.nextInt(), r = sc.nextInt();
                if (a <= r && a >= l) {
                    if (c == '+') {
                        a++;
                    } else {
                        a--;
                    }
                }
                sb.append(a + " ");
            }
            System.out.println(sb);
        }
    }
}