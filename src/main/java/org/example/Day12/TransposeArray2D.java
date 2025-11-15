package org.example.Day12;

public class TransposeArray2D {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result=transposeArray(arr);
        for (int i = 0; i < arr[0].length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] transposeArray(int[][] arr){
        int m= arr.length;
        int n=arr[0].length;
        int[][] result =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]= arr[j][i];
            }
        }
        return result;
    }
}
