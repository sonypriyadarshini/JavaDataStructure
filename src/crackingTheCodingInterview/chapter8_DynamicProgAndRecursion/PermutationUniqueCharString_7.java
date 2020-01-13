package crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;
/*
Permutations without Dups: Write a method to compute all permutations of a string of unique characters.
 */
public class PermutationUniqueCharString_7 {
    public static void main(String[] args) {
        String str = "AC";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    static void permute(String s, int l,int r){
        if(l==r)
            System.out.println(s);
        else{
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            permute(s,l+1,r);
            s=swap(s,l,i);
        }
        }
    }

    static String swap(String s,int l, int r){
        char a[]=s.toCharArray();
        char t=a[l];
        a[l]=a[r];
        a[r]=t;
        return String.valueOf(a);
    }
}
