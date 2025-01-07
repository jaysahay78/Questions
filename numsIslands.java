package com.company;

import java.util.*;

public class numsIslands {
    public void bfs(pair node, int[][] vis, char[][]grid){
        Queue<pair> q = new LinkedList<pair>();
        int[][] dir = {{-1, 0}, {0, -1}, {0, 1}, {1,0}};
        int n = grid.length;
        int m = grid[0].length;
        vis[node.first][node.second] = 1;
        q.add(node);


        while(!q.isEmpty()){
            pair node1 = q.remove();

            for (int[] d : dir){
                int row = node1.first + d[0];
                int col = node1.second + d[1];

                if (row>=0 && row<n && col >= 0 && col <n
                    && grid[row][col] == '1' && vis[row][col] == 0){
                    vis[row][col] = 1;
                    q.add(new pair(row, col));
                }
            }
        }
    }

    public int numislands(char[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int cnt = 0;

        for (int i =0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (vis[i][j] == 0 && grid[i][j] == '1'){
                    cnt++;
                    pair node = new pair(i, j);
                    bfs(node,vis, grid);
                }
            }
        }
        return cnt;
    }

    public void main(String[] args) {
        char[][] grd = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
        };
        System.out.println(numislands(grd));
    }
}
