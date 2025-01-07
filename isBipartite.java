package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class isBipartite {
    static boolean isBipartite(int[][] graph){
        int v = graph.length;
        int[] color = new int[v];
        for (int i = 0; i<v; i++){
                color[i] = -1;
        }
        for (int i=0; i<v; i++) {
            if (color[i] == -1) {
                if (!check(i, v, graph, color)) {
                    return false;
                }
            }
        }
        return true;
    }
    static boolean check(int start, int v, int[][] graph, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while (!q.isEmpty()){
            int node = q.peek();
            q.remove();

            for (int it : graph[node]){
                //if the adjacent node is not coloured,
                // we will give the opposite color for the Node as for the node "it" the
                // previous node is "node = q.peek"
                if (color[it] == -1){
                    color[it] = 1 - color[node];
                    q.add(it);
                }
                else if (color[it] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}
