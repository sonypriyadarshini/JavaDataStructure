package crackingTheCodingInterview.chapter1_Arrays;

//https://www.geeksforgeeks.org/determine-string-unique-characters/

/*Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? */

public class ValidateUniqueCharInString {

    public static void main(String[] args) {

        System.out.println(uniqueCharacters("abcda"));
    }

    //METHOD-1: sort and check i, i+1 values. O(nlogn)
    //METHOD-2: use an extra array of boolean and set the char to true and compare


    //METHOD3: without using extra DS only if the string has values between a-z
    static boolean  uniqueCharacters(String str)
    {

        if (str.length() > 26) { // Only 26 characters
            return false;
        }

        // Assuming string can have characters a-z
        // this has 32 bits set to 0
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int bitAtIndex = str.charAt(i) - 'a';
            int cond=1<<bitAtIndex;
            // if that bit is already set in checker,
            // return false
            System.out.println("bitindex: "+Integer.toBinaryString(bitAtIndex));
            System.out.println("checker: "+Integer.toBinaryString(checker ));
            System.out.println("if : "+Integer.toBinaryString(cond));
            System.out.println("if result: "+Integer.toBinaryString(checker & (1 << bitAtIndex)));
            if ((checker & cond) > 0)
                return false;

            // otherwise update and continue by
            // setting that bit in the checker

            checker = checker | cond;
            System.out.println("new checker: "+Integer.toBinaryString(checker | (1 << bitAtIndex)));
            System.out.println("-----------");
        }

        // no duplicates encountered, return true
        return true;
    }
}
