import java.util.Arrays;

public class peakElementII {
    static int[] findPeakGrid(int[][] mat) {
        int startCol = 0, endCol = mat[0].length-1;

        while(startCol <= endCol){
            int maxRow = 0, midCol = startCol + (endCol-startCol)/2;

            for(int row=0; row<mat.length; row++){
                maxRow = mat[row][midCol] >= mat[maxRow][midCol]? row : maxRow;
            }

            boolean leftIsBig    =   midCol-1 >= startCol  &&  mat[maxRow][midCol-1] > mat[maxRow][midCol];
            boolean rightIsBig   =   midCol+1 <= endCol    &&  mat[maxRow][midCol+1] > mat[maxRow][midCol];

            if(!leftIsBig && !rightIsBig)   // we have found the peak element
                return new int[]{maxRow, midCol};

            else if(rightIsBig)  // if rightIsBig, then there is an element in 'right' that is bigger than all the elements in the 'midCol', 
                startCol = midCol+1; //so 'midCol' cannot have a 'peakPlane'

            else // leftIsBig
                endCol = midCol-1;
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {10,20,15},{21,30,14},{7,16,32}
        };
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
}