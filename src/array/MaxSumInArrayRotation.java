package array;

//Maximum sum of i*arr[i] among all rotations of a given array

public class MaxSumInArrayRotation {

    public static void main(String[] args) {
        MaxSumInArrayRotation arrobj = new MaxSumInArrayRotation();
        int a1[] ={1,2,3,4};
        arrobj.maxSumInArrayRot(a1,a1.length);
    }

    public void maxSumInArrayRot(int arr[], int length){

/*      O(n):
        next_val = curr_val - (cum_sum - arr[i-1]) + arr[i-1] * (n-1);

        next_val = Value of &Sum;i*arr[i] after one rotation.
        curr_val = Current value of &Sum;i*arr[i]
        cum_sum = Sum of all array elements, i.e., &Sum;arr[i].*/

        int a[]={8,3,1,2};
        int curr_val=0, next_val=0, arr_sum=0, result=0, array_length=a.length, n=4;

        for(int i=0;i<array_length;i++){
            arr_sum+=a[i];
        }
        for(int i=0;i<array_length;i++){
            curr_val+=(a[i]*i);
        }
        result=curr_val;

        for(int i=1;i<array_length;i++) {
            next_val = curr_val - (arr_sum - a[i - 1]) + (a[i - 1] * (n - 1));
            curr_val= next_val;
            result=Math.max(result,next_val);
        }
        System.out.println("result: "+result);

    }

}
