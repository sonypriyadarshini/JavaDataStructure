package array;

public class MaxSubarraySum {
    public static void main(String args[]){
        int arr[]={2,3,-7,3,5,1};
        MaxSubarraySum maxArraySum = new MaxSubarraySum();
        System.out.println(maxArraySum.arraySum(arr));
//        System.out.println(maxArraySum.subarrayCountSum(arr, 5));
    }

    //Largest Sum Contiguous Subarray
    //Size of The Subarray With Maximum Sum

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
