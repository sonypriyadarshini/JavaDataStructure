package array.leetCode;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int res[]=productExceptSelf(new int[]{5,2,3,4});
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }

    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prod=1,temp=1, res[]=new int[n];
        for(int i=0;i<n;i++){
            prod=prod*temp;
            res[i]=prod;
            temp=nums[i];
        }
        prod=1;
        temp=1;
        for(int i=n-1;i>=0;i--){
            prod=prod*temp;
            res[i]=prod*res[i];
            temp=nums[i];
        }
        return res;
    }

    public static int[] productExceptSelf1(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 1;
        int runningProduct = 1;

        // forward pass
        for(int i=0;i<nums.length;i++) {
            runningProduct *= temp;
            result[i] = runningProduct;
            temp = nums[i];
        }

        //backword pass
        temp = 1;
        runningProduct = 1;
        for(int i=nums.length-1;i>=0;i--) {
            runningProduct *= temp;
            result[i] *= runningProduct;
            temp = nums[i];

        }
        return result;
    }
}
