package array;

public class MaxProdSubArray {

    public static void main(String args[]){
        int arr[]={1,2,-3,-4,0,-5};
        maxprod(arr);
    }

    public static void maxprod(int arr[]){
        int max=1,min=1,max_prod=0, temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                max=arr[i]*max;
                min=Math.min(1,min*arr[i]);
            }
            else if(arr[i]==0){
                min=1;
                max=0;
            }
            else if(arr[i]<0){
                temp=max;
                max=arr[i]*min;
                min=temp*arr[i];
            }
            if(max>max_prod)
                max_prod=max;
            if(max<=0)
                max=1;
        }
        System.out.println(max_prod);
    }
}
