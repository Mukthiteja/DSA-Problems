package org.example.Day22;

import java.util.Arrays;

public class CountVowels {

    public static void main(String[] args) {
        countVowels("mukthiteja is a good boy");
    }
    static void countVowels(String str){
        String vowel="aeiou";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowel.length() ; j++) {
                if(str.charAt(i) == vowel.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
