package org.example.Day17;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        PascalTriangle pas= new PascalTriangle();
        pas.pascalTriG1(5);
        //pas.pascalTriG2(5);
    }
    void pascalTriG1(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l= new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                l.add(1);
            }
            ans.add(l);
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
    void pascalTriG2(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l= new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i) l.add(1);
                else {
                    l.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
            }
            ans.add(l);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
