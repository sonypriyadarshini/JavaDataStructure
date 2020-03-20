package testpakg.crackingTheCodingInterview.chapter1_Arrays;

/*
1.5 One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale , pl e - > tru e
pales , pal e - > tru e
pale , bal e - > tru e
pale , bak e - > fals e

https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_05_One_Away
 */

public class OneAwayEdit {
    public static boolean oneEditReplace(String s1, String s2) {
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count>1)
                    return false;
            }
        }
        return true;
    }

    /* Check if you can insert a character into s1 to make s2. */
    public static boolean oneEditInsert(String s1, String s2) {
        int i1=0,i2=0;
        while(i1<s1.length() && i2<s2.length()){
            if(s1.charAt(i1)!=s2.charAt(i2)){
                if(i1!=i2){
                    return false;
                }
                i2++;
            }
            else
            {
                i1++;
                i2++;
            }
        }
        return true;

    }

    public static boolean oneEditAway(String first, String second) {
      if(first.length()==second.length())
          return oneEditReplace(first,second);
      else if(first.length()+1==second.length())
          return oneEditInsert(first,second);
      else if(first.length()-1==second.length())
            return oneEditInsert(second,first);
      else
          return false;

    }

    public static void main(String[] args) {
        String a = "ple";
        String b = "pale";
        boolean isOneEdit = oneEditAway(a, b);
        System.out.println(a + ", " + b + ": " + isOneEdit);
    }
}
