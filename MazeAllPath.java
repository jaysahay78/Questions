package com.company;

import java.util.Arrays;

public class MazeAllPath {
    public static void main(String[] args) {
        Boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[board.length][board[0].length];
        allPath("", board, 0, 0, path, 1);
    }
    static void allPath(String p, Boolean[][] maze, int r, int c, int[][] path, int step){
        if (r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            System.out.println(p);
            for (int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false; //We consider the first block to be checked as it is already added to the path
        path[r][c] = step;

        if (r<maze.length-1){
            allPath(p+'D', maze, r+1, c, path, step+1);//moving down
        }

        if (c<maze[0].length-1){
            allPath(p+'R', maze, r, c+1, path, step+1);//moving right
        }

        if (r>0){
            allPath(p+'U', maze, r-1, c, path, step+1);//moving up
        }

        if (c>0){
            allPath(p+'L', maze, r, c-1,path, step+1);//moving left
        }
        //This is the line where the function is over and one path is returned as answer
        //We shall restore the matrix to its original form here
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
