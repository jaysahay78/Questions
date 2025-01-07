package com.company;

import java.util.LinkedList;
import java.util.Queue;

class tuple {
    int first;
    int second;
    int third;
    tuple(int _first, int _second, int _third){
        this.first = _first;
        this.second = _second;
        this.third = _third;
    }
}

public class shortestBinaryMaze {
    static int shortestPathBinaryMatrix(int[][] grid){
        if (grid.length == 1 && grid[0][0] == 0){return 1;}
        if(grid[0][0] == 1){return -1;}
        int n = grid.length;
        Queue<tuple> q = new LinkedList<>();
        int[][] dist = new int[n][n];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                dist[i][j] = (int)(1e9);
            }
        }
        dist[0][0] = 1;
        q.add(new tuple(1,0,0));
        while(!q.isEmpty()){
            tuple it = q.peek();
            int dis = q.peek().first;
            int row = q.peek().second;
            int col = q.peek().third;
            q.remove();

            for (int delrow = -1; delrow<=1; delrow++){
                for (int delcol = -1; delcol<=1; delcol++){
                    int nrow = row + delrow;
                    int ncol = col + delcol;
                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol< n
                            && grid[nrow][ncol] == 0 && dis + 1< dist[nrow][ncol]){
                        dist[nrow][ncol] = dis+1;
                        if (nrow == n-1 && ncol == n-1){return dis+1;}
                        q.add(new tuple(dist[nrow][ncol], nrow, ncol));
                    }
                }
            }
        }
        return -1;
    }
}
