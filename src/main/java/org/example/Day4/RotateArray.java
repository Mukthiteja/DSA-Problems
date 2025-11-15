package org.example.Day4;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        RotateArray ra= new RotateArray();
        ra.rotate(arr,3);
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
        k=k%n;//to handle the k is greater than n case
        reverse(nums,0,n-k-1);//n-k-1 reverse the element till k-1
        reverse(nums,k,n);//reverse element from k;
        reverse(nums,0,n);//once reverse all elements to get the required arr

        Arrays.stream(nums).forEach(i-> System.out.print(i+" "));

    }
    public void reverse(int[] arr, int i,int j){
        while(j>i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
