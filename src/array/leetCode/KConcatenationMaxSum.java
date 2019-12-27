package array.leetCode;

public class KConcatenationMaxSum {
    public static void main(String[] args) {

        System.out.println(kConcatenationMaxSum(new int[]{1,2}, 4));
    }

    public static int kConcatenationMaxSum(int[] arr, int k) {
        long len = arr.length;
        if(len>Math.pow(10,5)||len*k>Math.pow(10,5))
            return 0;
        int j = 0,m=1;

        int[] res = new int[(int)len * k];
        long maxSum=arr[0],sum=arr[0];
        for (int i = 0; i < len*k; i++) {
            if (j < len) {
                res[i] = arr[j];
                j++;
                System.out.println("entered  "+res[i]);
            } else {
                j = 0;
                res[i] = arr[j];
                j++;
                System.out.println("entered d "+res[i]);
            }


        }
        for(int i=1;i<len*k;i++){
            sum=Math.max(res[i],sum+res[i]);
            System.out.println("sum  "+sum);
            maxSum=Math.max(maxSum,sum);
            System.out.println("sum max "+maxSum);
        }
        return (int)maxSum;
    }
}
