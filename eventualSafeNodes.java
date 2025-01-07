package com.company;
import java.util.*;

public class eventualSafeNodes {
    static List<Integer> eventualSafeNodes(int[][] graph){
        int n = graph.length;
        List<Integer>[] adj = new ArrayList[n];
        int[] indegree = new int[n];
        for (int i = 0; i< n; i++){
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<graph[i].length; j++){
                adj[graph[i][j]].add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i<n; i++){
            if (indegree[i] == 0){
                q.add(i);
            }
        }
        List<Integer> topo = new LinkedList<>();
        while (!q.isEmpty()){
            int node = q.poll();
            topo.add(node);

            if (adj[node] != null){
                for (Integer it: adj[node]){
                    indegree[it]--;
                    if (indegree[it] == 0){
                        q.add(it);
                    }
                }
            }
        }
        Collections.sort(topo);
        return topo;
    }
}
