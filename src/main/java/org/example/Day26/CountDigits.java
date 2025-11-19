package org.example.Day26;

public class CountDigits {
    public static void main(String[] args) {
        int a=1344543;
        int b=-12342;
        System.out.println(countDigits(b));
    }
    public static int countDigits(int n) {
        // code here
        String ns = Integer.toString(n);
        int len=0;
        if(ns.startsWith("-")){
            len = ns.substring(1,ns.length()).length();

        }else{
            len= ns.length();

        }
        return len;
    }
}
