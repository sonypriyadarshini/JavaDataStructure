package array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveVowels {

    public static void main(String args[]){
        Character c[] = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list = Arrays.asList(c);

        String s = "aeisdfgh";
        StringBuffer stringBuffer = new StringBuffer(s);
        for(int i=0;i<s.length();i++)
        {
            if(list.contains(s.charAt(i))) {
                stringBuffer.replace(i,i+1,"");
            }
        }
    }
}
