package testpakg.array.dynamicProgramming;

public class LongestCommonContinuousSubstring {
    public static void main(String args[]){

        commonSubstring("vbABCyq","ABgABCgp");
    }

    public static void commonSubstring( String a, String b){
        String resultString="";
        if(a.length()==0||b.length()==0) {
            System.out.println(resultString);
            return;
        }
        int table[][]=new int[a.length()][b.length()];

        for(int i =0;i<a.length();i++){
            for(int j=0;j<b.length();j++) {
                if (a.charAt(i) == b.charAt(j)) {

                    if (i == 0 || j == 0)
                        table[i][j] = 1;
                    else
                        table[i][j] = table[i - 1][j - 1] + 1;
                    if (table[i][j] > resultString.length())
                        resultString = a.substring(i - table[i][j] + 1, i + 1);
                }
            }
        }
        System.out.println("Common substring is "+resultString);
    }
}
