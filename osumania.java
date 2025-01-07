package com.company;
import java.util.*;

public class osumania {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n =sc.nextInt();
            sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k<n; k++){
                String[] arr = sc.nextLine().split("");
                for (int i = 0; i<4; i++){
                    if (arr[i].equals("#")) {
                        sb.append(i+1);
                        sb.append(" ");
                    }
                }
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
                System.out.print(sb.reverse()+" ");
            System.out.println();
        }
    }
}