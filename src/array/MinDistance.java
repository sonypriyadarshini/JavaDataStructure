package array;
//Find the minimum distance between two numbers

public class MinDistance {
    public static void main(String args[]){
        int arr[]={1,4,2,3,4,2,3,4,5};
        MinDistance minDistance = new MinDistance();
        minDistance.findDistance(arr,2,5);
    }

    public void findDistance(int array[], int a, int b){
        int temp=0,dist=array.length-1;
        int i=0;
        for( i=0;i<array.length;i++)
        {
            if(array[i]==a||array[i]==b){
                temp=i;
                break;
            }
        }
        for(;i<array.length;i++){
            if(array[i]==a||array[i]==b){
                if(array[i]!=array[temp]&&(i-temp)<dist){
                    dist=i-temp;
                    temp=i;
                }
                else
                    temp=i;
            }
        }
        System.out.println("Min distance : "+dist);
    }
}
