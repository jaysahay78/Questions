package com.company;

import java.util.ArrayList;
import java.util.List;

 class disjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public disjointSet(int n){
        for (int i=0; i<=n; i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findUltPar(int node){
        if (node == parent.get(node)){
            return node;
        }
        int ulp = findUltPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
    public void unionByRank(int u, int v) {
        int ulp_u = findUltPar(u);
        int ulp_v = findUltPar(v);
        if (ulp_v == ulp_u) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_u) > rank.get(ulp_v)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, ulp_v);
        }
    }

    public void unionBySize(int u, int v){
        int ulp_u = findUltPar(u);
        int ulp_v = findUltPar(v);
        if (ulp_v == ulp_u) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_u) + size.get(ulp_v));
        }
        else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}
class main1{
     public static void main(String[] args) {
         disjointSet ds = new disjointSet(7);
         ds.unionByRank(1,2);
         ds.unionByRank(2,3);
         ds.unionByRank(4,5);
         ds.unionByRank(6,7);
         ds.unionByRank(5,6);

         if (ds.findUltPar(3) == ds.findUltPar(7)){
             System.out.println("same");
         }
         else System.out.println("not same");

         ds.unionByRank(3,7);
     }
 }
