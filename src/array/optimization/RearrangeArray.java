package array.optimization;

//Rearrange an array such that arr[i] = i. if -1, ignore
public class RearrangeArray {
    public static void main(String[] args) {
        int arr[]={-1,-1,6,2,5,4,3};
        RearrangeArray rearrangeArray = new RearrangeArray();
        rearrangeArray.fix(arr);
    }

    public void fix(int array[]){
        for(int i=0;i<array.length;i++){
            if(array[i]!=-1 && array[i]!=i){
                int x = array[i];
                while(array[x]!=-1&&array[x]!=x){
                    int y = array[x];
                    array[x]=x;
                    x=y;
                }
                array[x]=x;
                if(array[i]!=i){
                    array[i]=-1;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(+array[i]);
        }
}
}
