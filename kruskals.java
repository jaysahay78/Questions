package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Edge implements Comparable<Edge>{
    int src, dest, weight;
    Edge(int _src, int _dest, int _wt){
        this.src = _src;
        this.dest = _dest;
        this.weight = _wt;
    }
    public int compareTo(Edge compareEdge){
        return this.weight - compareEdge.weight;
    }
}

public class kruskals {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        List<Edge> edges = new ArrayList<Edge>();
        for (int i=0; i<V; i++){
            for (int j=0; j<adj.get(i).size(); j++){
                int adjNode = adj.get(i).get(j).get(0);
                int wt = adj.get(i).get(j).get(1);
                int node = i;
                Edge temp = new Edge(i, adjNode, wt);
                edges.add(temp);
            }
        }
        disjointSet ds = new disjointSet(V);
        Collections.sort(edges);
        int mstWt = 0;
        for (int i = 0; i<edges.size(); i++){
            int wt = edges.get(i).weight;
            int u = edges.get(i).src;
            int v = edges.get(i).dest;

            if (ds.findUltPar(u) != ds.findUltPar(v)){
                mstWt += wt;
                ds.unionBySize(u,v);
            }
        }
        return mstWt;
    }
}
