package sorting;

public class MergeSort {

    public static void main(String args[]){
        int arr[]={12, 11, 13, 5, 6, 7};
        int sortedArray[]= mergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        System.out.println(sortedArray[i]);
    }

    public static int[] mergeSort(int a[], int start, int end){

        int ar[]=null;
        if(start<end)
        {
        int mid = (start+end)/2;

        mergeSort(a,start,mid);
        mergeSort(a,mid+1,end);

        ar = merge(a,start,mid,end);
        }
        return ar;
    }

    public static int[] merge(int a[],int start, int mid, int end){

        int lSize=mid-start+1;
        int rSize=end-mid;

        int lArrayrray[] = new int[lSize];
        int rArrayrray[] = new int[rSize];


        for(int i=0;i<lSize;i++ )
            lArrayrray[i]=a[i+start];
        for(int j=0;j<rSize;j++)
            rArrayrray[j]=a[mid+1+j];

        int k=1;
        int i=0,j=0;
        while(i<lSize && j<rSize){
            if(lArrayrray[i]<=rArrayrray[j])
                a[k++]=a[i++];
            else if (lArrayrray[i]>rArrayrray[j])
                a[k++]=a[j++];
        }
        while(i<lSize)
            a[k++]=a[i++];
        while(j<rSize){
            a[k++]=a[j++];

        }
        return a;
    }

}
