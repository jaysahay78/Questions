package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class cf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        long x = Long.parseLong(nm[1]);

        long[] wt = new long[n];

        String[] applicantStrings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            wt[i] = Long.parseLong(applicantStrings[i]);
        }
        Arrays.sort(wt);

        int i = 0;
        int j = n-1;
        int ans = 0;
        while(j >= i){
            if (wt[i] + wt[j] <= x){
                ans++;
                i++;
                j--;
            }
            else{
                ans++;
                j--;
            }
        }
        System.out.println(ans);
    }
}
