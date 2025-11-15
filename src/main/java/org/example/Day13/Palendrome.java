package org.example.Day13;

public class Palendrome {
    public static void main(String[] args) {
        if(pal("aaba")){
            System.out.println("It is palendrome");
        }else {
            System.out.println("not a pallendrome");
        }
    }
    static boolean pal(String str){
        StringBuilder str1 = new StringBuilder(str);
        String str2=str1.reverse().toString();
        return str.equals(str2);
    }

    static boolean pal1(String str){
        int i=0;
        int j=str.length()-1;
        while (j>i){
            if(str.charAt(i)!=str.charAt(j)){
                    return false;
            }
            i++;
            j--;

        }
        return true;
    }

}
