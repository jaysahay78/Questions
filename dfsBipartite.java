package com.company;

import java.util.ArrayList;

public class dfsBipartite {
    static boolean isbipartite(int v, ArrayList<ArrayList<Integer>> adj){
        int[] color = new int[v];
        for (int  i=0; i<v; i++){
            color[i] = -1;
        }
        for (int i =0; i<v; i++){
            if (color[i] == -1){
                if (!dfs(i, 0, adj, color)){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean dfs(int node, int col, ArrayList<ArrayList<Integer>> adj, int[] color){
        color[node] = col;
        for (Integer it: adj.get(node)){
            if (color[it] == -1){
                if (!dfs(it, 1-col, adj, color)){
                    return false;
                }
            }
            else if (color[it] == col) {
                return false;
            }
        }
        return true;
    }
}
