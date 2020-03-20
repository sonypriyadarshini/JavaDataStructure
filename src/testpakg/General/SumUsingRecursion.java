package testpakg.General;

public class SumUsingRecursion {
    public static void main(String args[]){
       System.out.println( sum(6,2));
    }
    public static int sum(int a,int b){
        if(b==0)
            return a;
        return sum(a,b-1)+1;
    }
}
