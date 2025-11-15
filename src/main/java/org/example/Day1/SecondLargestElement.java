package org.example.Day1;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr= {2,5,1,5,94,0};
        System.out.println(sLargest(arr));
    }

    private static int sLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(max> arr[i]) {smax = Math.max(smax,arr[i]);}
        }
        return smax;
    }
}
