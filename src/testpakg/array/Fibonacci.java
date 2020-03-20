package testpakg.array;

// find fibonacci series using Iterative and Recursive Method
public class Fibonacci {

    public static void main(String args[]){
        fibonacci();
        fibrec(0,1,16);
    }

    public static void fibonacci(){
        int a=0,b=1, n =6, num=0;
        System.out.print(b);
        for(int i=0;i<n;i++){
            num = a+b;
            a=b;
            b=num;
            System.out.print(" "+num);
        }
    }

    public static void fibrec(int x,int y, int no){
        int a=x,b=y, n =no, num=0;
        if(n==0)
            return;
        num =a+b;
        System.out.print("  "+num);
        fibrec(b,num,n-1);
    }
}
