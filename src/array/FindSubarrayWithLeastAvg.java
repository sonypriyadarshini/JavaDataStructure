package array;

//https://www.geeksforgeeks.org/find-subarray-least-average/

public class FindSubarrayWithLeastAvg    {

    public static void main(String[] args) {
        int a[]={3, 7, 90, 20, 10, 50, 40}, k = 3;
        subarrayWithLeastAvg(a,k);

    }

    static void subarrayWithLeastAvg(int a[],int k){
        int i=0, sum=0,maxsum=Integer.MAX_VALUE;

        for(i=0;i<k;i++){
            sum=sum+a[i];
        }
        maxsum=Math.min(maxsum,sum);
        for(;i<a.length;i++){
            sum=sum-a[i-k]+a[i];
            System.out.println(i-k+1+"  :  "+sum);
            maxsum=Math.min(sum,maxsum);
        }
        System.out.println(maxsum/k);
    }
}
