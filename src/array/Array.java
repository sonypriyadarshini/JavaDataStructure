package array;

public class Array {

    public static void main(String[] args) {
        Array arrobj = new Array();
        int a1[] ={1,2};
        arrobj.maxSumInArrayRotation(a1,2);
    }

    //array rotation
    public void arrayRotation(){
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 7; i++) {
            System.out.println("before rotation: "+a[i]);
        }
        int temp[] = new int[2];
        for (int i = 0; i < 2; i++) {
            temp[i] = a[i];
        }
        for (int i = 0; i < 5; i++) {
            a[i] = a[i + 2];
        }
        for (int i = 0; i < 2; i++) {
            a[i+5]=temp[i];
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("after rotation: "+a[i]);
        }
    }

    //Maximum sum of i*arr[i] among all rotations of a given array
    public void maxSumInArrayRotation(int arr[], int length){

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

    //Find the Rotation Count in Rotated Sorted array
    /*can be done by finding the minimum value and its index in an array using binary search(o(log n)*/

    int countRotations(int arr[], int low,
                       int high)
    {
        // This condition is needed to handle
        // the case when array is not rotated
        // at all
        if (high < low)
            return 0;

        // If there is only one element left
        if (high == low)
            return low;

        // Find mid
        // /*(low + high)/2;*/
        int mid = low + (high - low)/2;

        // Check if element (mid+1) is minimum
        // element. Consider the cases like
        // {3, 4, 5, 1, 2}
        if (mid < high && arr[mid+1] < arr[mid])
            return (mid + 1);

        // Check if mid itself is minimum element
        if (mid > low && arr[mid] < arr[mid - 1])
            return mid;

        // Decide whether we need to go to left
        // half or right half
        if (arr[high] > arr[mid])
            return countRotations(arr, low, mid - 1);

        return countRotations(arr, mid + 1, high);
    }

    //reverse an array using recursion/normally

}
