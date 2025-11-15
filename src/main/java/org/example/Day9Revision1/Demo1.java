package org.example.Day9Revision1;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        int[] arr= {7,9,0,1,2,4};
        //int[] arr ={1,0,1,0,2,0,1,1,2};
        //int[] arr1 ={10,20,30,40,50};
        //int[] arr2 ={5,15,25,35,45,55};
        //int result= d.secondLargestElement1(arr);
        //boolean result= d.isPrime2(2);
        //System.out.println(result);
        //int[] result = d.moveZeroToEnd2(arr);
        //int[] result =d.twoSum1(arr,15);
        //int[] result =d.twoSum2(arr,10);
        //int[] result = d.reverseArray2(arr);
        //int[] result = d.rotateArray1(arr,2);
        //int[] result =d.sortColors(arr);
        //int[] result = d.mergeSortedArray2(arr1,arr2);
        int[] result = d.nextLargeElt2(arr);
        for(int i:result){
            System.out.print(i+" ");
        }


    }
    boolean isPrime1(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n%i!=i){
                    count++;
                }
            }
            if(count==2)break;
        }
        if(count==2){
            return true;
        }
        else {
            return false;
        }
    }

    boolean isPrime2(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }else {
            return false;
        }
    }

    public int secondLargestElement1(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            max= Math.max(arr[i],max);
        }
        for(int j=0;j<n;j++){
            if(max> arr[j]){
                smax = Math.max(arr[j],smax);
            }
        }
        return smax;
    }

    public int[] moveZeroToEnd1(int[] arr){
        int n= arr.length;
        int[] result = new int[n];
        int update=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                result[update++]=arr[i];
            }
        }
        return result;
    }

    public int[] moveZeroToEnd2(int[] arr){
        int n = arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }

    public int[] twoSum1(int[] arr, int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] arr,int target){
        int n=arr.length;
        int result =0;
        Map<Integer,Integer> amap = new HashMap<>();
        int[] result1=new int[2];
        for(int i=0;i<n;i++){
            result=target-arr[i];
            if(amap.containsKey(result)){
                result1[1] =i;
                result1[0]=amap.get(result);
            }
            amap.put(arr[i],i);
        }
        return result1;
    }

    public int[] reverseArray1(int[] arr){
        int i=0;
        int j= arr.length-1;
        while (j>i){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    public int[] reverseArray2(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int temp =arr[n-i-1];
            arr[n-i-1]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public int[] rotateArray1(int[] arr,int k){
        int n= arr.length;
        k=k%n;
        reverseGiven(arr,0,n-k-1);
        reverseGiven(arr,n-k,n-1);
        reverseGiven(arr,0,n-1);

        return arr;
    }

    public void reverseGiven(int[] arr,int i,int j){

        while (j>i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    int [] sortZerosOnes1(int[] arr){
        int i=0;
        int j =arr.length-1;
        while (j >i){
            if(arr[i]==1){
                if(arr[j]==0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j--;
                    i++;
                }
                else{
                    j--;
                }
            }else {
                i++;
            }
        }
        return arr;
    }

    int[] sortColors(int[] arr){
        int i=0,mid =0;
        int j=arr.length-1;
        while(j>=mid){
            if(arr[mid]==0){
                int temp=arr[i];
                arr[i]=arr[mid];
                arr[mid]=temp;
                mid++;
                i++;
            } else if (arr[mid]==1) {
                mid++;
            }else{
                int temp =arr[mid];
                arr[mid]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }

    int[] mergeSortedArray1(int[] arr1,int[] arr2){
        int n= arr1.length;
        int m= arr2.length;
        int j=0,k=0;
        int[] result = new int[m+n];
        int i=0;
        while(j<n && k<m){
            if(arr1[j]<=arr2[k]){
                result[i++]=arr1[j++];
            }else {
                result[i++]=arr2[k++];
            }
        }
        if(j==n) {
            while(k < m) {
                result[i++] = arr2[k++];
            }
        }
        if(k==m){
            while(j<n){
                result[i++]=arr1[j++];
            }
        }
        return result;
    }

    int[] mergeSortedArray2(int[] arr1,int[] arr2){
        int m= arr1.length;
        int n= arr2.length;
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        int[] result = new int[m+n];
        while(i>=0 && j>=0){
            if(arr1[i]>=arr2[j]){
                result[k--]=arr1[i--];
            }else {
                result[k--]=arr2[j--];
            }
        }
        while (i >= 0) {
            result[k--] = arr1[i--];
        }
        while (j >= 0) {
            result[k--] = arr2[j--];
        }
        return result;
    }

    int[] nextLargeElt1(int[] arr){
        int n= arr.length;

        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i]=-1;
        }
        for(int i=0;i<n;i++){
            int max=-1;
            for(int j=i+1;j<n;j++){
                max= Math.max(max,arr[j]);
            }
            result[i]=max;
        }
        return result;
    }

    int[] nextLargeElt2(int[] arr){
        int n= arr.length;

        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i]=-1;
        }
        for(int i=n-1;i>=0;i--){
            int max=-1;
            for(int j=i+1;j<n;j++){
                max= Math.max(max,arr[j]);
            }
            result[i]=max;
        }
        return result;
    }
}