package testpakg.linkedList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String args[]){

        int arr[] = { 9, 3,4, 9, 6, 7, 4 };
        firstNonRepeat(arr);
    }

    public static void firstNonRepeat(int arr[]){
        int l = arr.length;
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        for(int i:arr)
        {
            if(hashMap.containsKey(i))
                hashMap.put(i,hashMap.get(i)+1);
            else
                hashMap.put(i,1);
        }
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet())
        {
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }

}
