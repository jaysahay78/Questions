package com.company;

public class floodFill {
    static  void dfs(int row, int col, int[][] ans, int[][] image, int newcolor,
                     int[] delRow, int[] delCol, int inicolor){
        ans[row][col] = newcolor;
        for (int i =0; i< 4; i++){
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            if (nrow >= 0 && nrow < image.length && ncol >= 0 && ncol < image[0].length
                && image[nrow][ncol] == inicolor && ans[nrow][ncol] != newcolor){
                dfs(nrow, ncol, ans, image, newcolor, delRow, delCol, inicolor);
            }
        }
    }
    static int[][] ff(int[][] image, int sr, int sc, int color){
        int inicolor = image[sr][sc];
        int[][] ans = image;
        int[] delrow = {-1, +1, 0, 0};
        int[] delcol = {0, 0, -1, +1};
        dfs(sr, sc, ans, image, color,delrow, delcol, inicolor);
        return ans;
    }
}
