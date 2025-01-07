package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class printShortesPath {
    static List<Integer> shortestPath(int n, int m, int[][] edges){
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i<m; i++){
            adj.get(edges[i][0]).add(new pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new pair(edges[i][0], edges[i][2]));
        }
        PriorityQueue<pair> pq = new PriorityQueue<pair>((x,y)->x.first - y.first);
        int[] dist = new int[n+1];
        int[] parent = new int[n+1];
        for (int i =1; i<=n; i++){
            dist[i] = (int)(1e9);
            parent[i] = i;
        }
        dist[1] = 0;
        pq.add(new pair(0,1));

        while(pq.size() != 0){
            pair it = pq.peek();
            int node = it.second;
            int dis = it.first;
            pq.remove();

            for (pair iter : adj.get(node)){
                int adjnode = iter.second;
                int edgewt = iter.first;

                if (dis + edgewt < dist[adjnode]){
                    dist[adjnode] = dis + edgewt;
                    pq.add(new pair(dist[adjnode], adjnode));
                    parent[adjnode] = node;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        if (dist[n] == 1e9){
            ans.add(-1);
            return ans;
        }
        int node = n;
        while(parent[node] != node){
            ans.add(node);
            node = parent[node];
        }
        ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}
