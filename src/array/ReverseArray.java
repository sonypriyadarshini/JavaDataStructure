package array;

public class ReverseArray {
    public static void main(String args[]){
        int arr[]={2,3,4,5};
        ReverseArray reverseArray = new ReverseArray();
        System.out.println("============================== Reverse array without recursion ===================");
        reverseArray.reverseUsingSwap(arr);
        reverseArray.printArray(arr);
        System.out.println("\n============================== Reverse array with recursion ===================");
        reverseArray.reverseUsingRecursion(arr,0,arr.length-1 );
        reverseArray.printArray(arr);
    }

    //reverse array normally, without recursion
    //Complexity: O(n)
    public void reverseUsingSwap(int arr[]){
        int last = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int t = arr[i];
            arr[i]=arr[last];
            arr[last]=t;
            last--;
        }
    }

    //reverse array using recursion
    //Complexity: O(n)
    public void reverseUsingRecursion(int arr[], int start, int last){
        if(start>=last)
            return;
            int t = arr[start];
            arr[start] = arr[last];
            arr[last] = t;
        reverseUsingRecursion(arr, start+1, last-1);
    }
    public void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"  ");
    }

}
