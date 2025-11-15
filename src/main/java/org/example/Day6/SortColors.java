package org.example.Day6;

public class SortColors {
    public static void main(String[] args) {
        //int[] arr={1,0,2,0,2,1};
        int[] arr ={1,0,1,0,2,0,1,1,2};
        arr= sortColors(arr);
        for(int i:arr){
            System.out.print(i);
        }
    }

    private static int[] sortColors(int[] arr) {
        int lo=0,mid=0,hi= arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,mid,lo);
                mid++;
                lo++;
            } else if (arr[mid]==1) {
                //swap(arr[mid],arr[mid-1]);
                mid++;
            }else{
                swap(arr,mid,hi);
                hi--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr,int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
