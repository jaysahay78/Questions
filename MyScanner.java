package com.company;
import java.util.*;
import java.io.*;

public class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    String next(){
        while(st == null || !st.hasMoreElements()){
            try{
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt(){
        return Integer.parseInt(next());
    }
    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
