package array;

public class SumOfNNumberRecursive {

    public static void main(String args[]){
        System.out.println(sumrecursive(9));
    }
    public static int sumrecursive(int n){
        if(n==0)
            return n;
        return (  n + sumrecursive(n-1));
    }



    public static int factorialrecursive(int n){
        if(n==0)
            return 1;

        return n*factorialrecursive(n-1);
    }
}
