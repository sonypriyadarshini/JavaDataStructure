package crackingTheCodingInterview.chapter16_MediumLevelPrograms;

public class ContiguousSubSequenceLargestSum_17 {

    public static void main(String args[]){
        int arr[]={2,3,-7,-3,10,1};

        arraySumNeg(arr);
    }

    static void arraySumNeg(int a[]){

        int sum=0,temp=0,c=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            c++;
            if(temp<sum)
                temp=sum;

            if(sum<0){
                sum=0;
                c=0;
            }
        }
        System.out.println(sum);


//        ========================== OR ===============================
//        int sum=0;
//        for(int i=0;i<a.length;i++){
//            if(a[i]<sum+a[i])
//            {
//                sum=sum+a[i];
//            }
//            else{
//                sum=a[i];
//            }
//
//        }
//        System.out.println(sum);
    }
}
