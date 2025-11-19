package org.example.Day24;

public class PrintingAllSubStrings {
    public static void main(String[] args) {
        printSubString("abcde");
    }
    static void printSubString(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            for (int j = i+1; j <s.length() +1; j++) {
                System.out.println(s.substring(i,j));
                count++;
            }
        }
        System.out.println(count);
    }
}
