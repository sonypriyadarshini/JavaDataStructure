package crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;
/*

Recursive Multiply: Write a recursive function to multiply two positive integers without using the * operator.
You can use addition, subtraction, and bit shifting, but you should minimize the number of those operations.

 */
public class RecursiveMultiply_5 {

    public static void main(String[] args) {
        System.out.println(recursiveMultiplication(3,10));
    }

    static int recursiveMultiplication(int a,int b){
        if(b==1)
            return a;
        else if(a==1)
            return b;
        if(a==0||b==0)
            return 0;
        if(b<a)
            return a+recursiveMultiplication(a,b-1);
        else
            return b+recursiveMultiplication(a-1,b);
    }
}
