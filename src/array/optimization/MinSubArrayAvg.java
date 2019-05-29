package array.optimization;

//Find the subarray with least average
/*Input:  arr[] = {3, 7, 90, 20, 10, 50, 40}, k = 3
        Output: Subarray between indexes 3 and 5
        The subarray {20, 10, 50} has the least average
        among all subarrays of size 3.*/

public class MinSubArrayAvg {
    public static void main(String[] args) {
        int arr[] = {3, 7, 90, 20, 10, 50, 40}, n=3;
        MinSubArrayAvg minSubArrayAvg = new MinSubArrayAvg();
        minSubArrayAvg.findAvg(arr,n);
        minSubArrayAvg.findAvgDynamicProg(arr,n);
    }

    public void findAvg(int array[],int n) {
        int count = 0, sum = 0, avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (count == n) {
                System.out.println("inside if i : " + i);
                avg=sum/n;
                if(avg>0)
                avg = Math.min(avg, sum / n);
                System.out.println("inside if Avg is : " + avg);

                i = i - n;
                System.out.println("inside if i : " + i);

                sum = count = 0;
                System.out.println("inside if Sum : " + sum);

            } else {
                sum = sum + array[i];
                count++;
                System.out.println("Outside if Sum : " + sum);
            }
        }
        System.out.println(avg);
    }

    public void findAvgDynamicProg(int array[],int n){
        int curr_sum=0, k=n, min_sum=0, result_index=0;
        for(int i =0;i<array.length;i++){
            curr_sum+=array[i];
        }
        min_sum=curr_sum;
        for(int i=k;i<array.length;i++){
            curr_sum=curr_sum+array[i]-array[i-k];

            if(curr_sum<min_sum){
                min_sum=curr_sum;
            result_index=i-k+1;
            }
        }
        System.out.println("result is "+result_index+" , "+(result_index+k-1));
    }
}
