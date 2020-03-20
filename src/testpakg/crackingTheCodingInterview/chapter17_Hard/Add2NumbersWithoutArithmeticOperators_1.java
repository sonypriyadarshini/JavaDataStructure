package testpakg.crackingTheCodingInterview.chapter17_Hard;

/*
https://www.geeksforgeeks.org/add-two-numbers-without-using-arithmetic-operators/
https://www.geeksforgeeks.org/to-find-sum-of-two-numbers-without-using-any-operator/

Add Without Plus: Write a function that adds two numbers. You should not use + or any arithmetic operators.
 */

public class Add2NumbersWithoutArithmeticOperators_1 {

    public static void main(String[] args) {
        System.out.println(add1(5,3));
        System.out.println(add2(5,3));
    }

    static int add1(int a,int b){
        while (b!=0){
            a++;
            b--;
        }
        return a;
    }

    static int add2(int a,int b){
        while (b!=0){
            int carry= a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
}
