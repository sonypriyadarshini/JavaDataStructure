package amazon;

public class NumberOfTiles1XN {

    public static void main(String args[]){
        countTiles(5);
    }
    public static void countTiles(int n){

        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1;i<=n;i++)
        {
            if (i >= 1 && i <= 3)
                res[i]=1;
            else if(i==4)
                res[i]=2;
            else
                res[i]=res[i-1]+res[i-4];
        }
        System.out.print(res[n]);
    }
}
