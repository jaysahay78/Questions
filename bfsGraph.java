package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsGraph {
    static ArrayList<Integer> BFS(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> list = new ArrayList<>();
        boolean vis[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            list.add(node);
            for (Integer it : adj.get(node)){
                if (!vis[it]){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return list;
    }
}
