package org.example;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.*;
class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int max=Integer.MIN_VALUE;
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] result = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=in.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}