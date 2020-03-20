package testpakg.array;

public class ReverseInGroups {

    public static void main(String args[]){
        int a[]={1, 2, 3, 4, 5, 6, 7, 8};
        int k=3;
        reverseArray(a, k);
    }

    public static void reverseArray(int a[], int k){

        int left =0, right =0,temp=0;
        for(int i=0;i<a.length;i=i+k){

            left =i;
            right = Math.min(k+i-1, a.length-1);

            while(left<right){
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
