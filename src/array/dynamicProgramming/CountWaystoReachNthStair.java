package array.dynamicProgramming;

//There are n stairs, a person standing at the bottom wants to reach the top.
//The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
//https://www.geeksforgeeks.org/count-ways-reach-nth-stair-using-step-1-2-3/

public class    CountWaystoReachNthStair {
    public static void main(String args[]) {

        countWays(1);

    }


    public static void countWays(int n){

//        int res[]=new int[n+1];
//        res[1]=1;
//        res[2]=2;
//
//        if(n<=2)
//            System.out.println(n);
//        else
//            for(int i=3;i<=n;i++){
//                res[i]=res[i-1]+res[i-2];
//                System.out.println(res[i]);
//            }
//        System.out.println(res[n]);

        int res[]=new int[n+1];
        if(n<=1){
            System.out.println(1);
return;        }
        res[1]=1;
        res[2]=2;
        if(n<=2){}
//            return n;
            else
        for(int i=3;i<=n;i++)
            res[i]=res[i-2]+res[i-1];
        System.out.println(res[n]);
    }
}
