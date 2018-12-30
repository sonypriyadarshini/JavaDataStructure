package array;

//Find the Rotation Count in Rotated Sorted array
public class CountRotation {
    public static void main(String args[]){
        int arr[]={4,5,6,89,2,3};
        CountRotation countRotation = new CountRotation();
        System.out.println("=============== Using Linear search ======================");
        countRotation.countRot(arr);
        System.out.println("=============== Using Binary search ======================");
        countRotation.countUsingBinSearch(arr,0,arr.length-1);
    }

    //rotation will be one less than the position of minimum element in an array.
    // minimum can be found using linear or binary search
    //Linear search.
    //Complexity: O(n)
    public void countRot(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1])
                System.out.println("Num of Rotations: "+(arr.length-1-i));
        }
    }

    //find number of rotations / find min/max element in a sorted, rotated array using binary search.
    //Complexity: O(Log n)

    public void countUsingBinSearch(int arr[],int low, int high) {
        System.out.println("low "+low+" High "+high);
        int mid = (low + high) / 2;
        if (low > high) {
            System.out.println("Wrong Parameters!!\n");
            return ;
        }
        if (low == high) {
            System.out.println("No. of rotations "+low);
            System.out.println("Max = Min = "+arr[low]);
            return ;
        }
        if (mid < high && arr[mid] > arr[mid + 1])
        {
            System.out.println("No. of rotations: "+(arr.length-(mid+1)));
            System.out.println("Minimum element: "+arr[mid+1]);
            System.out.println("Maximum element: "+arr[mid]);
            return ;
        }
        if (mid > low && arr[mid] < arr[mid - 1])
        {
            System.out.println("No. of rotations: "+(arr.length-(mid)));
            System.out.println("Minimum element: "+arr[mid]);
            System.out.println("Maximum element: "+arr[mid-1]);
            return ;
        }
        if(arr[high]>arr[mid])
            countUsingBinSearch(arr,low,mid-1);
        countUsingBinSearch(arr,mid+1,high);
    }
}
