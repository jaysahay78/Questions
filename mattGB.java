package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class mattGB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        while(k-- >0){
            String[] arr = sc.nextLine().split(" ");
            adj.get(Integer.parseInt(arr[0])).add(Integer.parseInt(arr[1]));
            adj.get(Integer.parseInt(arr[1])).add(Integer.parseInt(arr[0]));
        }

        int u = Integer.parseInt(sc.nextLine());
        adj.get(u).clear();
        for (int i =0; i<n; i++){
            adj.get(i).remove(Integer.valueOf(u));
        }

        Integer startNode = null;
        for (int i=0; i<adj.size(); i++){
            if (i != u && !adj.get(i).isEmpty()){
                startNode = i;
                break;
            }
        }
        if (startNode == null){
            System.out.println("Not Connected");
            return;
        }

        boolean[] vis = new boolean[adj.size()];
        dfs(adj, vis, startNode);

        //check whether the adjacency list is empty or not
        // and if its empty then check if array is visited or not
        boolean ans = true;
        for (int i = 0; i< adj.size(); i++){
            if (i!= u && !adj.get(i).isEmpty() && !vis[i]){
                ans = false;
            }
        }

        if (ans){
            System.out.println("Connected");
        }
        else System.out.println("Not Connected");


    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int node){
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(adj, vis, it);
            }
        }
    }
}