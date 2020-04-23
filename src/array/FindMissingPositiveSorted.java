package array;

//https://www.techiedelight.com/find-smallest-missing-element-sorted-array/

public class FindMissingPositiveSorted {
    public static void main(String[] args) {

        int a[]= {0,1,2,6,9,11,15};

        System.out.println(findMissingPositiveSorted(a,0,a.length-1));
    }

    static int findMissingPositiveSorted(int a[], int l, int r){
        if(l>r)
            return l;

        int mid = l+ (r-1)/2;
        if(mid==a[mid])
            return findMissingPositiveSorted(a,l+1,r);
        else
            return findMissingPositiveSorted(a,l,r-1);

    }
}
