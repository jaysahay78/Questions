package com.company;

import java.util.ArrayList;

public class detectCylic {
    static boolean dfsCheck(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathvis){
        vis[node] = 1;
        pathvis[node] = 1;
        for(Integer it: adj.get(node)){
            if (vis[it] == 0 ){
                if (dfsCheck(it, adj, vis, pathvis)){
                    return true;
                }
            }
            else if (pathvis[it] == 1) {
                return true;
            }
        }
        pathvis[node] = 0;
        return false;
    }
    static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[v];
        int[] pathvis = new int[v];
        for (int i=0; i<v; i++){
            if (vis[i] == 0){
                if (dfsCheck(i, adj, vis, pathvis)){
                    return true;
                }
            }
        }
        return false;
    }
}
