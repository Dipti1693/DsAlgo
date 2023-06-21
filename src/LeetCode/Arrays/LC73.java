package LeetCode.Arrays;

import java.util.Arrays;

public class LC73 {

    public static void main(String[] args) {
     int array[][]=new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        setZeroesBrute(array);
        setZeroes(array);
        setZeroesOptimal(array);


    }

    private static void setZeroesOptimal(int[][] matrix) {
        boolean col0 =false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0) col0 = true;
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=matrix.length-1;i>0;i--){
            for(int j=matrix[0].length-1;j>0;j--){
              if(matrix[0][j]==0 || matrix[i][0]==0){
                  matrix[i][j]=0;
              }
            }
            if(col0){
                matrix[i][0] = 0;
            }
        }
        System.out.println("optimal array..." + Arrays.deepToString(matrix));
    }

    public static void setZeroesBrute(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    setForRow(matrix, i);
                    setForColumn(matrix, j);
                }
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1)
                    matrix[i][j]=0;
            }
        }
        System.out.println("Array values" + Arrays.deepToString(matrix));
    }
    public static void setZeroes(int[][] matrix) {
     int[]rowArray=new int[matrix.length];
     int[]colArray=new int[matrix[0].length];
     for(int i=0;i<matrix.length;i++){
         for(int j=0;j<matrix[0].length;j++)
         {
             if(matrix[i][j]==0){
               rowArray[i]=1;
               colArray[j]=1;
             }
         }
     }
     for(int i=0;i< matrix.length;i++){
         for(int j=0;j<matrix[0].length;j++){
             if(rowArray[i]==1 || colArray[j]==1){
                 matrix[i][j]=0;
             }
         }
     }
        System.out.println("Better approach array..." + Arrays.deepToString(matrix));
    }

    private static void setForColumn(int[][] matrix, int col) {
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][col]!=0)
            matrix[i][col]=-1;
        }
    }

    private static void setForRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = -1;
            }
        }
    }
}
