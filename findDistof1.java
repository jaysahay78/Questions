package com.company;

import java.util.*;

class triple{
    int row;
    int col;
    int dist;
    triple(int _row, int _col, int _dist){
        this.row = _row;
        this.col = _col;
        this.dist = _dist;
    }
}
public class findDistof1 {
    static int[][] distMatrix(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];
        int[][] vis = new int[n][m];

        Queue<triple> q = new LinkedList<>();


        for (int i = 0; i<n; i++){
            for (int j =0; j<m; j++){
                if(mat[i][j] == 1){
                    q.add(new triple(i,j,0));
                    vis[i][j] = 1;
                }
            }
        }

        int[] drow = {-1, 0, 0, +1};
        int[] dcol = {0, -1, +1, 0};
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int dist = q.peek().dist;
            q.remove();
            ans[r][c] = dist;
            for (int  i =0; i<4; i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if (nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] == 0){
                    vis[nrow][ncol] = 1;
                    q.add(new triple(nrow, ncol, dist+1));
                }
            }
        }
        return ans;
    }
}
