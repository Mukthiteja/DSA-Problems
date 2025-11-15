package org.example.Day13;

import static org.example.Day1.Prime.isPrime;

public class Fibonacci {
    public static void main(String[] args) {
        fib(10);
    }
    static void fib(int n){

        int n1=0,n2=1,n3;
        if(n==0){
            System.out.print(n1);
        } else if (n==1) {
            System.out.print(n1+" "+n2);
        }
        for (int i = 0; i <n; i++) {
            n3=n1+n2;
            System.out.print(n1+" ");
            n1=n2;
            n2=n3;
        }
    }

    /*checking the number if it is prime num and fibonacci num
    static void fib(int n){

        int n1=0,n2=1,n3;
        if(n==0){
            System.out.print(n1);
        } else if (n==1) {
            System.out.print(n1+" "+n2);
        }
        for (int i = 0; i <n; i++) {
            n3=n1+n2;if(isPrime(n1)){
                System.out.print(n1+" ");}
            n1=n2;
            n2=n3;
        }
    }*/
}
