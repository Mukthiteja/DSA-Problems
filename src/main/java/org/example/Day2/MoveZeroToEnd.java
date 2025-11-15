package org.example.Day2;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr ={3,0,2,5,0,4,0};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]=arr[count];
                arr[count]= temp;
                count++;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
