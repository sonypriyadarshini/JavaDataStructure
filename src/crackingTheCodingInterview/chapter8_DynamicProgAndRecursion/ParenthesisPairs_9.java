package crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;

import java.util.ArrayList;

/*
Parens; implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n pairs of parentheses.

https://www.programcreek.com/2014/01/leetcode-generate-parentheses-java/

 */

public class ParenthesisPairs_9 {

    static ArrayList<String> res=new ArrayList<>();

    public static void main(String[] args) {
        printParen(2);
        System.out.println(res);
    }

    static ArrayList<String> printParen(int n){
        printHelper(n,n,"");
        return res;
    }

    static void printHelper(int left,int right, String s){
        if(left>right)
            return;
        if(left==0 && right==0){
            res.add(s);
            return;
        }
        if(left>0)
            printHelper(left-1,right,s+"(");
        if(right>0)
            printHelper(left,right-1,s+")");
    }
}
