package org.example.Day3;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        //withFor(arr);
        withWhile(arr);
    }
    static void withFor(int[] arr){
        int n= arr.length;
        for(int i=0;i< n/2;i++){
                int temp= arr[i];
                 arr[i]=arr[n-i-1];
                 arr[n-i-1]=temp;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }

    static void withWhile(int[] arr ){
        int i=0;
        int j= arr.length-1;
        while (j>i){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int e :arr){
            System.out.println(e);
        }
    }
}
