package array;

public class SecondLargestNumber {

    public static void main(String args[]) {
        seclargestNum();
    }

    public static void seclargestNum(){
        int max1=0, max2=0;
        int a[]={1,2,3,4};
        for(int i=0;i<a.length;i++){
            if(max1<a[i]){
                max2=max1;
                max1=a[i];
            }
            else{
                max2=a[i];
            }

        }
        System.out.println(max1+" "+max2);


    }
}
