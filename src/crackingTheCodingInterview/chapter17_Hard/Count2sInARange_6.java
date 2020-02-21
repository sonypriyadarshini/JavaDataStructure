package crackingTheCodingInterview.chapter17_Hard;

/*
Count of 2s: Write a method to count the number of 2s that appear in all the numbers between 0 and n (inclusive).
https://www.geeksforgeeks.org/number-of-occurrences-of-2-as-a-digit-in-numbers-from-0-to-n/
 */
public class Count2sInARange_6 {

    public static void main(String[] args) {
        System.out.println(count2sBruteForce(22));
    }

    static int count2sBruteForce(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            int j=i;

            while(j>0){
                if(j%10==2)
                    count++;
                j=j/10;
            }
        }
        return count;
    }
}
