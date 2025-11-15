package org.example.Day10;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        NextPermutation np= new NextPermutation();
        int[] arr ={1, 2, 3, 6, 5, 4};
        np.nextPermutation(arr);
    }
    void nextPermutation(int[] arr) {
        int n= arr.length;

        int pivot =-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot =i;
                break;
            }
        }

        if(pivot == -1){
            reverseArr(arr,0,n-1);
            return;
        }

        for(int i=n-1;i>pivot;i--){
            if(arr[pivot]<arr[i]){
                int temp =arr[pivot];
                arr[pivot] = arr[i];
                arr[i]=temp;
                break;
            }
        }

        Arrays.sort(arr,pivot+1,n);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    void reverseArr(int[] arr,int i,int j){
        //int i=0;
        //int j=arr.length;

        while(j>=i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
