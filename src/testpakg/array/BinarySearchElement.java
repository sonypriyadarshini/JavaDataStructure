package testpakg.array;

//Search an element in a sorted and rotated testpakg.array
public class BinarySearchElement {

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        BinarySearchElement searchElement = new BinarySearchElement();
        System.out.println("Element is found at position: "+searchElement.binarySearch(arr,0,arr.length-1,5));
    }

    //search an element using binary search
    //Complexity: O(Log n)
    public int binarySearch(int array[], int low, int high, int x){
       if(high>=low){
           int mid = (low+high)/2;
           if(array[mid]==x)
               return mid;
           if(array[mid]>x)
               return binarySearch(array, low, mid-1, x);
           else
               return binarySearch(array, mid+1, high, x);
       }
        return 0;
    }
}
