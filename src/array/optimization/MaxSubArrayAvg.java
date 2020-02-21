package array.optimization;

//https://www.geeksforgeeks.org/find-maximum-average-subarray-of-k-length/

public class MaxSubArrayAvg {
    public static void main(String args[]) {
        int arr[]={1, 12, -5, -6, 50, 3}, k=4;
        maxSubArray(arr,k);

    }
    public static void maxSubArray(int arr[], int k){
        int curr_sum=0, max_sum, result_index=0;
        for(int i=0;i<k;i++){
            curr_sum+=arr[i];
        }
        max_sum=curr_sum;
        for(int i=k;i<arr.length;i++) {
            curr_sum= curr_sum+arr[i]-arr[i-k];

            if(max_sum<curr_sum){
                max_sum=curr_sum;
                result_index=i;
            }
        }
        System.out.println(" "+result_index+" , "+(result_index-k+1));
    }

    public static void minDist(int arr[],int x,int y){
        int temp=0, i=0, dist=arr.length;
        for( i=0;i<arr.length;i++){
            if(arr[i]==x||arr[i]==y){
                temp=i;
                break;
            }
        }
        for(;i<arr.length;i++){
            if(arr[i]==x||arr[i]==y){
                if(arr[i]!=arr[temp]&& (dist>(i-temp)))
                {
                    dist=i-temp;
                    temp=i;
                }
                else
                temp=i;
            }
        }
    }

}
