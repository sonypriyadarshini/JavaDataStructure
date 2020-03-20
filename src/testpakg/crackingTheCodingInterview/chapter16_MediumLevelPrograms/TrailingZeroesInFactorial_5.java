package testpakg.crackingTheCodingInterview.chapter16_MediumLevelPrograms;
/*
https://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
 */

public class TrailingZeroesInFactorial_5 {

    public static void main(String[] args) {
        System.out.println(findTrailingZeroes(100));
    }

    static int findTrailingZeroes(int n){
        int count=0;
        for(int i=5;n/i>0;i=i*5){
            count= count+n/i;
        }
        return count;
    }
}
