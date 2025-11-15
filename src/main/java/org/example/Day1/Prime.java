package org.example.Day1;

public class Prime {
    public static void main(String[] args) {

        System.out.println(isPrime(7));
        System.out.println(isPrimeOptimized(7));
    }
    //normal approach
    public static boolean isPrime(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){return true;}
        else {return false;}
    }

    static boolean isPrimeOptimized(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count++;
                if(num/i!=i){
                    count++;
                }
            }
            if(count ==2 )break;
        }
        if(count==2){return true;}
        else {return false;}
    }
}
