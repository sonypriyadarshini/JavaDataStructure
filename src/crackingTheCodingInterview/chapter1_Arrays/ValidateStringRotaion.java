package crackingTheCodingInterview.chapter1_Arrays;

/*
1.9 String Rotation; Assume you have a method isSubs t rin g which checks if one word is a substring
of another. Given two strings, si and s2, write code to check if s2 is a rotation of si using only one
call to isSubs t rin g [e.g., "wate r bottle " is a rotation oP'erbottlewat"),

https://javarevisited.blogspot.com/2017/07/2-ways-to-check-if-one-string-is-rotation-of-another-String.html
 */
public class ValidateStringRotaion {

    public static void main(String[] args) {
        System.out.println(checkRotation("abcd","dabc"));
        System.out.println(checkRotationWithConcatenation("abcd","dacb"));
    }

    //Method1: using concatenation, using substring() once
    static boolean checkRotationWithConcatenation(String s1, String s2){

        if(s1.length()!=s2.length())
            return false;

        s1=s1+s1;
        if(s1.contains(s2))
            return true;
        return false;
    }

    //Method2: without using concatenation, but using substring() twice
    static boolean checkRotation(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
        int loc1=s2.indexOf(s1.charAt(0)); //1
        int loc2=s2.length()-loc1;         //3

        if(loc1>-1) {
            System.out.println(s2.substring(loc1)+"   :   "+s1.substring(0,loc2));
            if (s1.charAt(loc2) == s2.charAt(0) && s1.substring(0,loc2).equalsIgnoreCase(s2.substring(loc1,s2.length())))
                return true;
        }
        return false;
    }
}
