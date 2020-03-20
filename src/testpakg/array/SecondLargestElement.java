package testpakg.array;

public class SecondLargestElement {
    public static void main(String args[]){
        int arr[]={1,2,9,6,7};
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        System.out.println(secondLargestElement.findElement(arr));
    }

    //without using sort or nested for loop
    public int findElement(int array[]){
        int first=0, second=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>first) {
                second = first;
                first = array[i];
            }
            else if(array[i]>second)
                second = array[i];
            }
        return second;
    }

    //using sort
}
