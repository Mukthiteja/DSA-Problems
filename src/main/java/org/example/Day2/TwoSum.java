package org.example.Day2;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
        int[] arr = {3,1,4,6,7,9,10};
        int target =8;
        twoSumWithArray(arr,target);
        twoSumWithHashMap(arr,target);
    }

    private static void twoSumWithArray(int[] arr, int target) {
        int[] array = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    array[0]=i;
                    array[1]=j;
                    break;
                }
            }
        }
        for(int i:array){
            System.out.println(i);
        }
    }

    private static void twoSumWithHashMap(int[] arr, int target) {
        int[] array = new int[2];
        Map<Integer,Integer> amap= new HashMap<>();
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=target-arr[i];
            if(amap.containsKey(result)){
                array[0]=i;
                array[1]=amap.get(result);
            }
            amap.put(arr[i],i);
        }
        for(int i:array){
            System.out.println(i);
        }
    }
}
