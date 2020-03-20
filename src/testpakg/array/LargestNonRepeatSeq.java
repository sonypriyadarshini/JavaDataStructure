package testpakg.array;

import java.util.HashSet;
import java.util.Set;
////incomplete >>>>>>>>>>>>>>

public class LargestNonRepeatSeq {

    public static void main(String args[]){
        largestnonerepeatseq();
    }

    public static void largestnonerepeatseq(){
        String s = "abssdefghiabsmnk9876558899";
        char c[] = s.toCharArray();
        int length=0;
        String out=null;
        StringBuffer stringBuffer = new StringBuffer(" ");
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.add(s.charAt(i))==true) {
                stringBuffer.append(s.charAt(i));
                length=Math.max(length,stringBuffer.length());
            }
            else if(length<=stringBuffer.length()){
                out=stringBuffer.toString();
                System.out.println(" result "+out);

                stringBuffer.setLength(0);
                stringBuffer.append(s.charAt(i));
            }
        }
        System.out.println("final result "+out);


    }
}
