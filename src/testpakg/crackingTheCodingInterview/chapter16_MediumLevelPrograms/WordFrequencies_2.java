package testpakg.crackingTheCodingInterview.chapter16_MediumLevelPrograms;

/*

Word Frequencies: Design a method to find the frequency of occurrences of any given word in a book.
What if we were running this testpakg.algorithm multiple times?

https://www.geeksforgeeks.org/find-frequency-of-each-word-in-a-string-in-python/
 */
public class WordFrequencies_2 {

    public static void main(String[] args) {
        String ss="Apple Mango Orange Mango Guava Guava Mango";
        System.out.println(findFrequencies(ss,"mango"));
    }

    static int findFrequencies(String ss, String word){
        String s[] =ss.split(" ");
        int count=0;
        for(String t:s){
            if(t.toLowerCase().equalsIgnoreCase(word.toLowerCase()))
                count++;
        }
        return count;
    }
}
