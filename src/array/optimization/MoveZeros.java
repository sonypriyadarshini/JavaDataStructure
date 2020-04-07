package array.optimization;

//move zeroes to the end in a single traversal
public class MoveZeros {
public static void main(String args[]){
    int arr[]={0,1,0,0,3,4};
    MoveZeros moveZeros= new MoveZeros();
    moveZeros.moveInSingletraversal(arr);
}

public void moveInSingletraversal(int arr[]){
    int count =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            int t = arr[count];
            arr[count]=arr[i];
            arr[i]=t;
            count++;
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}
