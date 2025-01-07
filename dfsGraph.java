package com.company;

import java.util.ArrayList;

public class dfsGraph {
    static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list){
        vis[node] = true;//marking current node as visited;
        list.add(node);

        for (Integer it : adj.get(node)){
            if (!vis[it]){
                dfs(it, vis, adj, list);
            }
        }
    }
    static ArrayList<Integer> DFSgraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[v+1];
        vis[0] = true;
        ArrayList<Integer> list = new ArrayList<>();
        dfs(0, vis, adj, list);
        return list;
    }
}
