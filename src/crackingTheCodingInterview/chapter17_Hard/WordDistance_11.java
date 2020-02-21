package crackingTheCodingInterview.chapter17_Hard;

/*
https://www.geeksforgeeks.org/minimum-distance-between-words-of-a-string/
 */
public class WordDistance_11 {

    public static void main(String[] args) {
        String s = "geeks for geeks contribute practice";
        String w1 = "for";
        String w2 = "practice";
        System.out.println(distance(s, w1, w2));
    }

    static int distance(String s, String w1, String w2){
        String words[]=s.split(" ");
        int prev=0,i=0;
        for( i=0;i<words.length;i++){
            if(words[i].equalsIgnoreCase(w1) || words[i].equalsIgnoreCase(w2)){
                prev=i;
                break;
            }
        }
        int mindist=Integer.MAX_VALUE;
        while (i<words.length){
            if(words[i].equalsIgnoreCase(w1) || words[i].equalsIgnoreCase(w2)){
                if(!words[i].equalsIgnoreCase(words[prev]) && (i-prev)<mindist){
                    mindist=i-prev-1;
                }
                prev=i;
            }
            i++;
        }
        return mindist;
    }
}
