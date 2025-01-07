package com.company;

import java.util.ArrayList;
import java.util.Stack;

class pairs{
    int first, second;
    pairs(int _first, int _second){
        this.first = _first;
        this.second = _second;
    }
}

public class shortestPathDAG {
    static void dfs(int node, Stack<Integer> st, ArrayList<ArrayList<pairs>> adj, int[] vis){
        vis[node] = 1;
        for (int i = 0; i<adj.get(node).size(); i++){
            int v = adj.get(node).get(i).first;
            if (vis[v] == 0){
                dfs(v, st, adj, vis);
            }
        }
        st.push(node);
    }

    static int[] shortestPath(int n, int m, int[][] edges){
        ArrayList<ArrayList<pairs>> adj = new ArrayList<>();
        for (int i=0; i<n; i++){
            ArrayList<pairs> temp = new ArrayList<pairs>();
            adj.add(temp);
        }
        for (int i = 0; i<m; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new pairs(v, wt));
        }
        int[] vis = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i<n; i++){
            if (vis[i] == 0){
                dfs(i, st, adj, vis);
            }
        }

        int[] dist = new int[n];
        for (int i = 0; i<n; i++){
            dist[i] = (int)(1e9);
        }
        dist[0] = 0;
        while(!st.isEmpty()){
            int node = st.peek();
            st.pop();

            for (int i = 0; i<adj.get(node).size(); i++){
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;

                if (dist[node] + wt < dist[v]){
                    dist[v] = wt + dist[node];
                }
            }
        }
        for (int i=0; i<n; i++){
            if (dist[i] == 1e9){
                dist[i] = -1;
            }
        }
        return dist;
    }
}
