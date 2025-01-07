package com.company;


import java.util.List;
import java.util.PriorityQueue;
class pr{
    int distance;
    int node;
    pr(int _distance, int _node){
        this.distance = _distance;
        this.node = _node;
    }
}
public class dijkstra {
    static int[] dijkstraShortestPath(int v, List<List<List<Integer>>> adj, int src){
        //min-heap
        PriorityQueue<pr> pq = new PriorityQueue<pr>((x,y)-> x.distance - y.distance);

        int[] dist = new int[v];
        for (int i = 0; i<v; i++){
            dist[i] = (int)(1e9);
        }
        dist[src] = 0;
        pq.add(new pr(0,src));

        while (pq.size() != 0){
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for (int i = 0; i<adj.get(node).size(); i++){
                int adjnode = adj.get(node).get(i).get(0);
                int edgeweight = adj.get(node).get(i).get(1);

                if (dis + edgeweight < dist[adjnode]){
                    dist[adjnode] = dis + edgeweight;
                    pq.add(new pr(dist[adjnode], adjnode));
                }
            }
        }
        return dist;
    }
}
