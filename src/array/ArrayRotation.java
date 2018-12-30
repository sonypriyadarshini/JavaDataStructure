package array;

public class ArrayRotation {

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        //rotating clockwise by 2 will result in {5,6,1,2,3,4}
        ArrayRotation arrayRotation = new ArrayRotation();
        arrayRotation.printRotatedArray(arr, arr.length,2);
        arrayRotation.printCyclicRotatedArray(arr);
    }

    //rotating {1,2,3,4,5,6} clockwise by 2 will result in {5,6,1,2,3,4}
    //Complexity: O(n)
    public void printRotatedArray(int array[],int sizeOfArray, int noOfRotation){
        int newarr[] = new int[sizeOfArray];
        int j=0;
        for(int i=0;i<sizeOfArray;i++)
        {
            if(i>=(sizeOfArray-noOfRotation)){
                newarr[j]=array[i];
                j++;
            }
        }
        for(int i=0;i<(sizeOfArray-noOfRotation);i++){
            newarr[j]=array[i];
            j++;
        }
        for(int i=0;i<sizeOfArray;i++){
            System.out.println(" "+newarr[i]);
        }
    }

    //rotating an array cyclically. 1 roation each time
    public void printCyclicRotatedArray(int array[]){
        int x = array[array.length-1];
        for(int i=array.length-1;i>0;i--){
            array[i]=array[i-1];
        }
        array[0]=x;
        for(int i=0;i<array.length;i++){
            System.out.println(" "+array[i]);
        }
    }

}
