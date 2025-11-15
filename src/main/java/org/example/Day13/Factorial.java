package org.example.Day13;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        int result=1;
        for(int i=2;i<=n;i++){
            result=i*result;
        }
        return result;
    }
}
