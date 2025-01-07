package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class courseSchedule2 {
    static int[] canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        int[] indegree = new int[numCourses];
        for (int[] pair : prerequisites){
            int course = pair[0];
            int prerequisite = pair[1];
            if (adj[prerequisite] == null){
                adj[prerequisite] = new ArrayList<>();
            }
            adj[prerequisite].add(course); // directed graph with prerequisite->course edge
            indegree[course]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i=0; i<numCourses; i++){
            if (indegree[i] == 0){
                q.add(i);
            }
        }

        int[] topo = new int[numCourses];
        int i = 0;
        while(!q.isEmpty()) {
            int node = q.peek();
            topo[i++] = node;

            if (adj[node] != null) { // the nodes with indegree 0 should point to some other node
                for (Integer it : adj[node]) { // or else it would mean the node is simply independent of the graph
                    indegree[it]--;
                    if (indegree[it] == 0) {
                        q.add(it);
                    }
                }
            }
        }
        if(i == numCourses){return topo;}
        int[] arr = {};
        return arr;
    }
}
