package org.example.Day5;

public class SortZerosOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,0};
        arr=segregate0and1(arr);
        for(int i:arr){
            System.out.print(i);
        }

    }
    static int[] segregate0and1(int[] arr) {
        int n = arr.length;
        int i=0,j=n-1;
        while(j>i){
            if(arr[i]==1){
                if(arr[j]==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }else{
                    j--;
                }
            }else {
                i++;
            }
        }
        return arr;
    }
}
