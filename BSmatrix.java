package com.company;

import java.util.Arrays;

class BSmatrix {
    public static void main(String[] args) {
        int[][] matrix = {{-1, 3}};

        System.out.println(Arrays.toString(search(matrix,3 )));
    }

    static int[] search (int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int rowIndex = 0;
        int colIndex = col-1;

        while (rowIndex < matrix.length && colIndex>= 0) {

              if (matrix[rowIndex][colIndex] == target){
              return new int[]{rowIndex, colIndex};
              }
              if (matrix[rowIndex][colIndex] < target) {
                  row++;
              }
              else {colIndex--;
              }
        }

        return new int[]{-1, -1};
    }
}