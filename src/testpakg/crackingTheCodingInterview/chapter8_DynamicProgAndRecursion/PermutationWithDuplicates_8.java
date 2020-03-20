package testpakg.crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;

import java.util.HashSet;

public class PermutationWithDuplicates_8 {

    static HashSet<String> res=new HashSet<>();
    public static void main(String[] args) {
        String str = "ACA";
        int n = str.length();
        permute(str, 0, n - 1);
        System.out.println(res);
    }


    static void permute(String s, int l,int r){
        if(l==r)
            res.add(s);
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
