package array.dynamicProgramming;

public class FibonacciDp {

    public static void main(String args[]){
        fib(9);
    }

    public static void fib(int n){
        int fib[] = new int[n+1];
        fib[0]=1;
        fib[1]=2;

        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(fib[n-1]);
    }
}
