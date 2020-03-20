package testpakg.crackingTheCodingInterview.chapter1_Arrays;

//https://algorithms.tutorialhorizon.com/replace-all-spaces-in-a-string-with/
/*
URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character testpakg.array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr 3ohn Smit h 13
Output: "Mr%203ohn%20Smith"
*/

public class ReplaceSpaces {

    public static void main(String[] args) {
        System.out.println(replace("a b c "));
    }


    //method1: split the testpakg.array with spaces, and add %20 whenever space appears in a new testpakg.array

//https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_03_URLify/Question.java


    //method2: without using split, count number of spaces, interate from end, add 20 when space is encountered
    static String replace(String s){
        StringBuilder sb=new StringBuilder();
        String sa[]=s.split(" ");
        for(String x:sa){
            sb.append(x);
            sb.append("%20");
        }
        if(!s.substring(s.length()-1).equalsIgnoreCase(" ")){
        s=sb.substring(0,sb.length()-3);
        }
        s=sb.toString();
        return s;
    }
}
