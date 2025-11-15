package org.example.Day16Revision2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        //int[] arr2= {2, 3, -8, 7, -1, 2};
        int[] arr2={10,0,0,20,30,40,50};
        //int[] arr2={2,0,1,2,0,1,1,0,2};
        //int[] arr3={5,15,25,35,45};
        //int[] arr2={1,0,0,1,0,1};
        Demo2 demo2= new Demo2();
        //demo2.spiralMat(arr);
        //demo2.waveForm(arr);
        //demo2.isPal1("aabaa");
        //demo2.isPal2("aabaa");
        //demo2.fibo(5);
        //demo2.fact(5);
        //demo2.tranpose(arr);
        //demo2.printArray(arr);
        //demo2.printArray(demo2.tranpose(arr));
        //rotateArrayBy90(arr);
        //demo2.maxSSArray(arr2);
        //demo2.nextPermutation(arr2);
        //demo2.nextGreatest1(arr2);
        //demo2.nextGreatest2(arr2);
        //demo2.mergedArray(arr2,arr3);
        //demo2.sortColor(arr2);
        //demo2.sortZerosOnes(arr2);
        //demo2.rotateArray(arr2,3);
        //demo2.twoSum1(arr2,10);
        //demo2.twoSum2(arr2,10);
        //demo2.moveZeroEnd(arr2);
        //demo2.seconLargetElt(arr2);
        demo2.isPrime1(21);
        demo2.isPrime2(21);
    }

    private void isPrime2(int n) {
        int count=0;
        for (int i = 1; i*i<=n ; i++) {
            if(n%i==0){
                count++;
                if(n/i!=i){
                    count++;
                }
            }
            //if(count>2)break;
        }
        if(count==2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }

    private void isPrime1(int n) {
        int count=0;
        for (int j = 1; j <=n; j++) {
            if(n%j==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }

    private void seconLargetElt(int[] arr2) {
        int maxi=Integer.MIN_VALUE;
        int smaxi =Integer.MIN_VALUE;
        for(int i=0;i< arr2.length;i++){
            maxi=Math.max(maxi,arr2[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]<maxi){
                smaxi=Math.max(smaxi,arr2[i]);
            }
        }
        System.out.println(smaxi);
    }

    void spiralMat(int[][] arr) {
        int minR=0,maxR=arr[0].length-1;
        int minC=0,maxC=arr.length-1;

        while(minR<=maxR && minC<=maxC){
            //left to right
            for (int i = minC; i <=maxC ; i++) {
                System.out.print(arr[minR][i]+" ");
            }
            minR++;
            //top to bottom
            if(minR>maxR || minC>maxC)break;
            for (int j = minR; j <=maxR ; j++) {
                System.out.print(arr[j][maxC]+" ");
            }
            maxC--;
            //right to left
            if(minR>maxR || minC>maxC)break;
            for (int i = maxC; i >=minC ; i--) {
                System.out.print(arr[maxR][i]+" ");
            }
            maxR--;
            //bottom to top
            if(minR>maxR || minC>maxC)break;
            for (int j = maxR; j >=minR ; j--) {
                System.out.print(arr[j][minC]+" ");
            }
            minC++;
        }
    }

    void waveForm(int[][] arr){
        int m= arr[0].length;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for (int j=0;i<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for (int j = m-1; j>=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    void isPal1(String str){
        StringBuilder str1 = new StringBuilder(str);
        String str2= str1.reverse().toString();
        if(str.equals(str2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    // we can use the while loop also
    void isPal2(String str){
        int flag=0;
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = str.length()-1; j >=0 ; j--) {
                if(str.charAt(i)==str.charAt(j)){
                   flag=1;
                }else{
                    flag=0;
                }
            }

        }
        if(flag==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    void fibo(int n){
        int n1=0,n2=1,n3;
        for(int i=0;i<n;i++){
            //System.out.println(n1+"");
            n3=n1+n2;
            System.out.println(n1+"");
            n1=n2;
            n2=n3;
        }
    }

    void fact(int n){
        int result=1;
        for(int i=0;i<n;i++){
            result+=result*i;
        }
        System.out.println(result);
    }

    static int[][] tranpose(int[][] arr){
        int m =arr[0].length;
        int n=arr.length;
        int[][] result= new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                result[i][j]=arr[j][i];
            }
        }
        return result;
    }

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void rotateArrayBy90(int[][] arr){
        int[][] result=tranpose(arr);
        for (int i = 0; i < arr.length; i++) {
            reverseArray(result[i]);
        }
        printArray(arr);
        System.out.println();
        printArray(result);
    }

    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(j>=i){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }

    void maxSSArray(int[] arr){
        int maxi=arr[0];
        int sum=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            maxi=Math.max(maxi+arr[i],arr[i]);
            sum = Math.max(sum,maxi);
        }
        System.out.println(sum);
    }

    //break statements are important here
    void nextPermutation(int[] arr){
        //for(int i:arr){
         ///   System.out.print(i+" ");
        //}
        int pivot=-1;
        int n=arr.length;
        for (int i =n-2 ; i >=0 ; i--) {
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverseArray(arr);
        }
        for (int i = n-1; i >=pivot; i--) {
            if(arr[i]>arr[pivot]){
                int temp=arr[pivot];
                arr[pivot]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        Arrays.sort(arr,pivot+1,n);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    void nextGreatest1(int[] arr){
        int[] nextG=new int[arr.length];
        nextG[arr.length-1]=-1;

        for(int i=0;i<arr.length-1;i++){
            int max=-1;
            for (int j = i+1; j <arr.length ; j++) {
                max=Math.max(max,arr[j]);
            }
            nextG[i]=max;
        }
        for(int i:nextG){
            System.out.print(i+" ");
        }

    }

    void nextGreatest2(int[] arr){
        int[] nextG=new int[arr.length];
        /*for (int i = 0; i < arr.length; i++) {
            nextG[i]=-1;
        }*/
        nextG[arr.length-1]=-1;
        for(int i= arr.length-2;i>=0;i--){
            int max=0;
            for (int j = i+1; j < arr.length ; j++) {
                max=Math.max(max,arr[j]);
            }
            nextG[i]=max;
        }
        for(int i:nextG){
            System.out.print(i+" ");
        }
    }

    void mergedArray(int[] a,int[] b){
        int m=a.length;
        int n= b.length;
        int i=0,j=0,k=0;
        int[] result=new  int[m+n];
        while (m>i && n>j){
            if(a[i]<b[j]){
                result[k]=a[i];
                i++;
            }else {
                result[k]=b[j];
                j++;
            }
            k++;
        }

        if(i==m){
            while(j<n){
                result[k++]=b[j++];
            }
        }
        if(j==n){
            while (i<m){
                result[k++]=a[i++];
            }
        }
        for (int l:result) {
            System.out.print(l+" ");
        }
    }

    void sortColor(int[] arr){
        int lo=0,mid=0,hi= arr.length-1;
        while(mid<hi){
            if(arr[mid]==0){
                int temp=arr[lo];
                arr[lo]=arr[mid];
                arr[mid]=temp;
                lo++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            } else if (arr[mid]==2) {
                int temp=arr[hi];
                arr[hi]=arr[mid];
                arr[mid]=temp;
                hi--;
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    void sortZerosOnes(int[] arr){
        int count=0;
        int i=0,j= arr.length-1;
        while(i<j){
            if(arr[i]==1){
                if(arr[j]==0){
                    int temp= arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i++;
                    j--;
                }else j--;
            }else i++;

        }
        for(int l:arr){
            System.out.print(l+" ");
        }
    }

    void rotateArray(int[] arr,int k){
        int n= arr.length-1;
        k=k%n;
        reverseArr1D(arr, n-k-1, 0);
        reverseArr1D(arr, n, k);
        reverseArr1D(arr, n, 0);


        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
    }

    void reverseArr1D(int[] arr,int n,int m){
        int i=n,j= m;
        while(j>i ){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }

    void twoSum1(int[] arr,int target){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.print(i+" "+j);
                    break;
                }
            }
        }
    }

    void twoSum2(int[] arr,int target){
        int n=arr.length;
        Map<Integer,Integer> amap = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            int result=target-arr[i];
            if(amap.containsKey(result)){
                System.out.print(i+" "+ amap.get(result));
            }
            amap.put(arr[i],i);
        }
    }

    void moveZeroEnd(int[] arr){
        int count=0;
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        for(int i:arr){
            System.out.println(i);;
        }
    }

}