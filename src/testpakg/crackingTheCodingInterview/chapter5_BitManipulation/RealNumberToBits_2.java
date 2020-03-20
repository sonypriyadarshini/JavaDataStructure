package testpakg.crackingTheCodingInterview.chapter5_BitManipulation;

/*
https://www.geeksforgeeks.org/converting-a-real-number-between-0-and-1-to-binary-string/

Binary to String: Given a reai number between 0 and 1 (e.g., 0.72) that is passed in as a double,
print the binary representation.
If the number cannot be represented accurately in binary with at most 32 characters, print "ERROR."
 */

public class RealNumberToBits_2 {

    public static void main(String[] args) {
        double num1 = 0.625; // Input value in Decimal
        System.out.println( printBinary(num1));
    }

    static String printBinary(double n){
        if(n<=0 || n>=1)
            return "ERROR";

        StringBuilder binary=new StringBuilder();
        binary.append(".");

        while (n>0){
            if(binary.length()>32)
                return "ERROR";
            double r=n*2;
            if(r>=1){
                binary.append("1");
                n=r-1;
            }
            else{
                binary.append("0");
                n=r;
            }
        }
        return binary.toString();

    }

}
