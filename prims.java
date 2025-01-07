package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

class pair1{
    int node, distance;
    pair1(int _node, int _distance){
        this.node = _node;
        this.distance = _distance;
    }
}
public class prims {
    static int sumOfMst(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        PriorityQueue<pair1> pq = new PriorityQueue<pair1>((x,y)-> x.distance - y.distance);
        int[] vis = new int[v];
        //wt, node
        pq.add(new pair1(0,0));
        int sum = 0;
        while(pq.size() > 0){
            int node = pq.peek().node;
            int wt = pq.peek().distance;
            pq.remove();

            if (vis[node] == 1){continue;}
            vis[node] = 1;
            sum += 1;

            for (int i=0; i< adj.get(node).size(); i++){
                int edgeWt = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(2);
                pq.add(new pair1(adjNode, edgeWt));
            }
        }
        return sum;
    }
}
