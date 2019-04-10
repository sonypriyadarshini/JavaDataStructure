package array;

//>>>>>>>>>>>>>>>> Incomplete
public class MaxSubArrayMultiplication {

    public static void main(String args[]){
        maxSubArrayMul();
    }

    public static void maxSubArrayMul(){
        int arr[]={1,2,-3,3,9,-1,-1};
        int mul=0, temp=0;
        for(int i=0;i<arr.length;i++){
            mul = Math.max(arr[i],mul+arr[i]);
            temp=Math.max(temp,mul);
        }
        System.out.println("max multiplied "+temp);

        System.out.println("finding the length of the sub array with largest sum");

        int sum=0, temp1=0, count=0;
        for(int i=0;i<arr.length;i++){
            sum = arr[i]+sum;
            count++;
            if(temp1<sum)
                temp1=sum;

            if(sum<=0){
                sum=0;count=0;
            }
        }
        System.out.println("largest sum is "+temp1+" length of subarray "+count);

    }
}
