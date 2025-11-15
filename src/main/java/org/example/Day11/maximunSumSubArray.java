package org.example.Day11;

public class maximunSumSubArray {
    public static void main(String[] args) {
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        System.out.println(maximumSum(arr));
    }

    static int maximumSum(int[] arr){
        int n= arr.length;
        int maxi=arr[0];
        int result=arr[0];
        for(int i=1;i<n;i++){
            maxi=Math.max(maxi+arr[i],arr[i]);
            result=Math.max(result,maxi);
        }
        return result;
    }
}
