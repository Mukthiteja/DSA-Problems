package org.example.Day14;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        spiral(arr);
    }

    private static void spiral(int[][] arr) {
        int minR=0,minC=0,maxR=arr.length-1,maxC= arr[0].length-1;
        while(maxR>=minR && maxC>=minC){
            //left to right
            for (int j = minC; j <=maxC ; j++) {
                System.out.print(arr[minR][j]+" ");
            }
            minR++;
            //top to bottom
            if(minR>maxR || minC>maxC)break;
            for (int i =minR; i <=maxR ; i++) {
                System.out.print(arr[i][maxC]+" ");
            }
            maxC--;
            //right to left
            if(minR>maxR || minC>maxC)break;
            for (int j = maxC; j>=minC ; j--) {
                System.out.print(arr[maxR][j]+" ");
            }
            //bottom to top
            if(minR>maxR || minC>maxC)break;
            maxR--;
            for (int i =maxR; i >=minR ; i--) {
                System.out.print(arr[i][minC]+" ");
            }
            minC++;

        }
    }
}
