package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class topologicalSort {
    static void dfs(int node, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj, int[] vis){
        vis[node] = 1;
        for (Integer it : adj.get(node)){
            if (vis[it] == 0){
                vis[it] = 1;
                dfs(it, st, adj, vis);
            }
        }
        st.push(node);
    }

    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[v];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i<v; i++){
            if (vis[i] == 0){
                dfs(i, st, adj, vis);
            }
        }
        int[] ans = new int[v];
        int i = 0;
        while(!st.isEmpty()){
            ans[i++] = st.peek();
            st.pop();
        }
        return ans;
    }
}