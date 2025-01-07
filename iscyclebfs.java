package com.company;
import java.util.*;

public class iscyclebfs {
    static boolean checkCycleBfs(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[src] = true;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(src, -1));

        while (!q.isEmpty()){
            int node = q.peek().first;
            int prev = q.peek().second;
            q.remove();
            for (Integer it : adj.get(node)){
                if(!vis[it]){
                    vis[it] = true;
                    q.add(new pair(node, prev));
                }
                else if(prev != it){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean iscycle(int v, ArrayList<ArrayList<Integer>> adj){
    boolean[] vis = new boolean[v];
    for (int i =0; i<v; i++){
        vis[i] = false;
    }
        for (int i = 0; i<v; i++){
            if (!vis[i]){
                if (checkCycleBfs(i, adj, vis)){
                    return true;
                }
            }
        }
        return false;
    }
}
