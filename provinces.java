package com.company;

import java.util.ArrayList;

public class provinces {
    public static void main(String[] args) {

    }
    static int provinces(int[][] isConnected){
        int v = isConnected.length;
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for (int i=0; i<v; i++){ //initiate an ArrayList<ArrayList<Integer>>
            adjLs.add(new ArrayList<>());
        }

        //change the adj matrix to adjLs
        for (int i = 0; i<v; i++){
            for (int j = 0; i<v; i++){
                if (isConnected[i][j] == 1 && i!=j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        int[] vis = new int[v];
        int count = 0;
        for (int i = 0; i<v; i++){
            if (vis[i] == 0){
                count++;
                dfs(i, adjLs, vis);
            }
        }

        return count;
    }
    static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] vis){
        vis[node] = 1;
        for (Integer it : adjLs.get(node)){
            if (vis[it] == 0){
                vis[it] = 1;
                dfs(it, adjLs, vis);
            }
        }
    }
}