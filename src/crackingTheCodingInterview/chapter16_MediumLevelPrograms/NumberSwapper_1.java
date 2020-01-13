package crackingTheCodingInterview.chapter16_MediumLevelPrograms;

/*
Number Swapper: Write a function to swap a number in place (that is, without temporary vari- ables).
 */
public class NumberSwapper_1 {

    public static void main(String[] args) {
        int a =20,b=100;
        swapWithoutTemp(a,b);
        swapWithBitwise(a,b);
    }

    static void swapWithoutTemp(int a,int b){
        System.out.println("Before swap: a="+a+"   ,   b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Before swap: a="+a+"   ,   b="+b);
    }

    static void swapWithBitwise(int a,int b){
        System.out.println("Before swap: a="+a+"   ,   b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Before swap: a="+a+"   ,   b="+b);
    }
}
