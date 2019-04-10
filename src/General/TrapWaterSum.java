package General;

public class TrapWaterSum {

    public static void main(String args[]){
        int arr[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        findwater(arr);
    }

    public static void findwater(int a[]){

        int n =a.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int water=0;

        left[0]=a[0];
        for(int i=1;i<n;i++)
            left[i]=Math.max(left[i-1],a[i]);

        right[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--)
            right[i]=Math.max(right[i+1],a[i]);

        for(int i=1;i<n;i++)
        water += Math.min(left[i],right[i]) - a[i];

        System.out.println(water);

    }
}
