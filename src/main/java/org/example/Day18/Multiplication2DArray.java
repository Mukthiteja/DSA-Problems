package org.example.Day18;

public class Multiplication2DArray {
    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6}};
        int[][] b={{1,0,1},{1,3,4},{2,5,1}};

        multiplicationArray(a,b);
    }
    static void multiplicationArray(int[][] a,int[][] b){
        int[][] c = new int[a.length][b[0].length];
        if(a[0].length == b.length ){
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    for (int k = 0; k < b.length ; k++) {
                        //c[i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j].....;
                        c[i][j] += a[i][k]*b[k][j];

                    }

                }

            }
        }else {
            System.out.println("enter the valid array");
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
