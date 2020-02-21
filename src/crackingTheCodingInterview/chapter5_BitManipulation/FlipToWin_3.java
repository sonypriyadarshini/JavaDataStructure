package crackingTheCodingInterview.chapter5_BitManipulation;

public class FlipToWin_3 {

    public static void main(String[] args) {
        String s="11001101111001";
        longestSequencePostFlip(s);
    }
    static int longestSequencePostFlip(String s){

        int c[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        int max_index=0;
        int prev_zero=-1;
        int prev_prev_zero=-1;
        int max_count=0;

        for(int cur=0;cur<c.length;++cur){
            if(c[cur]==0){
                if(cur-prev_prev_zero>max_count){
                    max_count=cur-prev_prev_zero;
                    max_index=prev_zero;
                }
                prev_prev_zero=prev_zero;
                prev_zero=cur;
            }
        }
        if(c.length-prev_prev_zero>max_count)
            max_index=prev_zero;

        System.out.println(max_count);
        System.out.println(max_index);
        return max_index;
    }
}
