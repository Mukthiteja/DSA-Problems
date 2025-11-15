package org.example.Day8;

public class NextGreatestValue {
    public static void main(String[] args) {
        int[] arr = {2,71,3,5,8,6,1};
        int n= arr.length;

        int[] result= nextGreatestArray(arr,n);

        for(int i:result){
            System.out.print(i+" ");
        }
    }

  /* private static int[] nextGreatestArray(int[] arr,int n) {
        int[] result = new int[n];
        result[n-1] = -1;
        for(int i=0;i<n-1;i++){
            int max=-1;
            for(int j=i+1;j<n;j++){
                max=Math.max(max,arr[j]);
            }
            result[i]=max;
        }

        return result;
    }*/

    private static int[] nextGreatestArray(int[] arr,int n) {
        int[] result = new int[n];
        result[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            int max=-1;
            for(int j=i+1;j<n;j++){
                max=Math.max(max,arr[j]);
            }
            result[i]=max;
        }
        return result;
    }

}
