package sorting;

public class InsertionSort {

    public static void main(String args[]){
        int arr[]={12, 11, 13, 5, 6, 7};
        insertionSort(arr);

    }

    public static void insertionSort(int arr[]){
        int l=arr.length;
        int key=0,j=0;

        for(int i=1;i<l;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }

        for(int i=0;i<l;i++)
            System.out.println(arr[i]);
    }

}
