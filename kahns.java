package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class kahns {
    static int[] topSort(int v, ArrayList<ArrayList<Integer>> adj){
        int[] indegree = new int[v];
        for (int i = 0; i<v; i++){
            for (int it : adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i<v; i++){
            if (indegree[i] == 0){
                q.add(i);
            }
        }
        int[] topo = new int[v];
        int i = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            topo[i++] = node;

            for (Integer it : adj.get(node)){
                indegree[it]--;
                if (indegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return topo;
    }
}
