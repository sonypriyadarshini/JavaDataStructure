package array;

import java.util.HashMap;

public class RemoveDupWords {
    public static void main(String args[]){
        removedupwords();
    }

    public static void removedupwords(){
        String str= "abc abc def ghi abc ghi";
        String[] words = str.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String s:words){
            if(!hashMap.containsKey(s)) {
                stringBuffer.append(s).append(" ");
                hashMap.put(s,1);
            }
        }
        System.out.println(stringBuffer.toString());
    }
}
