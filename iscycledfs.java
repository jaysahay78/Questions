package com.company;

import java.util.ArrayList;

public class iscycledfs {
    static boolean checkCycleDfs(int src, int prev, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[src] = true;
        for (Integer it : adj.get(src)){
            if (!vis[it]){
                if (checkCycleDfs(it, src, adj, vis)){
                    return true;
                }
            }
            else if (it != prev){
                return true;
            }
        }
        return false;
    }
    static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v];
        for (int i = 0; i<v; i++){
            vis[i] = false;
        }
        for (int i =0; i<v; i++){
            if (!vis[i]){
                if (checkCycleDfs(i, -1, adj, vis)){return true;}
            }
        }
        return false;
    }
}
