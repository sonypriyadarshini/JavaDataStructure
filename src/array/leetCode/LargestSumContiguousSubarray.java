package array.leetCode;

//Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.

public class LargestSumContiguousSubarray {
    public static void main(String args[]){
        int arr[]={2,3,-1,1,-4,1};
        LargestSumContiguousSubarray maxArraySum = new LargestSumContiguousSubarray();
        System.out.println(maxArraySum.arraySum(arr));
        maxArraySum.arraySumNeg(arr);
//        System.out.println(maxArraySum.subarrayCountSum(arr, 5));
    }

    //Largest Sum Contiguous Subarray
    //Size of The Subarray With Maximum Sum
//Kadane's algorithm. but works only when at least one number is +ve in the array

    public int arraySum(int array[]){

        int sum=0, temp=0,count=0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
            count++;
             if(temp<sum){
                temp = sum;
             }
            if(sum<0){
                sum=0;
                count=0;
            }

        }
        System.out.println("size of subarray "+(count));
        return temp;
    }

    //largest sum contiguous array with negtive handled
    public void arraySumNeg(int a[]){

        {
            int temp2 = a[0];
            int sum2 = a[0];

            for (int i = 1; i < a.length; i++)
            {
                sum2 = Math.max(a[i], sum2+a[i]);
                temp2 = Math.max(temp2, sum2);
            }
            System.out.println("Largest sum "+ temp2);
        }
    }

    public void longestsubseqSum(int a[], int size){
            int max_so_far = 0, max_ending_here = 0;
            for (int i = 0; i < size; i++)
            {
                max_ending_here = max_ending_here + a[i];
                if (max_ending_here < 0)
                    max_ending_here = 0;

       /* Do not compare for all elements. Compare only
          when  max_ending_here > 0 */
                else if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
            }
            System.out.println( max_so_far);

    }
//incomplete:>>>>
    //Smallest subarray with sum greater than a given value
    public int subarrayCountSum(int array[], int val){
        int sum=0, temp=0, count=0, ifcount=0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
            if(sum>=val) {
                ifcount++;
                System.out.println("ifcount "+ifcount);

                System.out.println("count "+count);

                if (count > 0)
                    count = Math.min(count, i + 1);
                else
                    count = i + 1;
                System.out.println("count in min "+count);

                sum = 0;
                System.out.println("i "+count);

                i = i - ifcount;

            }
//            else if(temp<=sum)
//                temp = sum;
        }
        return count;
    }
}
