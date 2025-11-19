package org.example.Day20;

public class SearchingElement2d {
    public static void main(String[] args) {
        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}};
        boolean flag =searching1(arr,5);
        System.out.println(flag);
    }

    static boolean searching(int[][] arr,int target){
        int m= arr.length;
        int n=arr[0].length;
        int j=n-1;
        int i=0;
        while (i<m &&j>=0){
            if(arr[i][j]==target){
                return true;
            }else if(arr[i][j]>target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
    static boolean searching1(int[][] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(arr[i][j]==target){
                    return true;
                }
            }
        }

        return false;
    }
}
