package com.company;

import java.util.*;
class tup{
    int first, second, third;

    tup(int _first, int _second, int _third){
        this.first = _first;
        this.second = _second;
        this.third = _third;
    }
}

public class flights {
    static int CheapestFlight(int n, int[][] flights, int src, int dst, int k){
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for (int i =0; i<flights.length; i++){
            adj.get(flights[i][0]).add(new pair(flights[i][1], flights[i][2]));
        }
        Queue<tup> q = new LinkedList<>();
        //(stops, node, amount)
        int[] price = new int[n];
        for (int i=0; i<n; i++){
            price[i] = (int) (1e9);
        }
        price[src] = 0;
        q.add(new tup(0, src, 0));
        while (!q.isEmpty()){
            int numStops = q.peek().first;
            int node = q.peek().second;
            int amount = q.peek().third;
            q.remove();

            if (numStops > k){continue;}
            for (pair iter : adj.get(node)){
                int costPrice = iter.first;
                int adjnode = iter.second;

                if (costPrice + amount < price[adjnode] && numStops <= k){
                    price[adjnode] = costPrice + amount;
                    q.add(new tup(numStops+1, adjnode, price[adjnode]));
                }
            }
        }
        if (price[dst] == 1e9){return -1;}
        return price[dst];
    }
}
