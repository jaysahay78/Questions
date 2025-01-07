package com.company;

import java.util.Arrays;

public class surroundedRegions {
    static void dfs(int row, int col, int[][] vis, char[][] board, int[] delrow, int[] delcol){
        vis[row][col] = 1;
        int n = board.length;
        int m = board[0].length;

        for (int i=0; i<4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if (nrow>=0 && nrow<n && ncol>=0 && ncol<m
                    && vis[nrow][ncol] == 0 && board[nrow][ncol] == 'O'){
                dfs(nrow, ncol, vis, board, delrow, delcol);
            }
        }
    }

    static void surRegions(char[][] board){
        int n = board.length;;
        int m = board[0].length;
        int[] delrow = {-1, 0, 0, 1};
        int[] delcol = {0, -1, 1, 0};
        int[][] vis = new int[n][m];

        for (int j = 0; j< m; j++){
            if (board[0][j] == 'O' && vis[0][j] == 0){
                dfs(0, j, vis, board, delrow, delcol);
            }
            if(board[n-1][j] == 'O' && vis[n-1][j] == 0){
                dfs(n-1, j, vis, board, delrow, delcol);
            }
        }

        for (int i=0; i<n; i++){
            if (board[i][0] == 'O' && vis[i][0] == 0){
                dfs(i, 0, vis, board, delrow, delcol);
            }
            if(board[i][m-1] == 'O' && vis[i][m-1] == 0){
                dfs(i, m-1, vis, board, delrow, delcol);
            }
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (vis[i][j] == 0 && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'X','O','X'},{'O','X','O'},{'X','O','X'}};
        surRegions(board);
        for (char[] a : board) {
            System.out.println(Arrays.toString(a));
        }
    }
}
