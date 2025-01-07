package com.company;
import java.lang.Integer;
import java.util.*;
import java.lang.*;

public class MultiAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ArrayList <java.lang.integerr> list = new ArrayList<>(50);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //for (int i = 0; i<=5; i++){
          //  list.add(in.nextInt());
        for (int i=0; i<2; i++){
            list.add(new ArrayList<>());
        }

        for (int i=0; i<2; i++){
            for(int j=0; j<5; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
