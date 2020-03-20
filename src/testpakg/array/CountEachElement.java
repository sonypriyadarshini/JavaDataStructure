package testpakg.array;

import java.util.HashMap;
import java.util.Map;

public class CountEachElement {

    public static void main(String args[]) {
        countEachElement();
    }

    public static void countEachElement(){
        int arr[]={1,3,4,2,2,1,7,3,2};
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i:arr){
            if(hashMap.containsKey(i))
            {
                hashMap.put(i,hashMap.get(i)+1);
            }
            else
                hashMap.put(i,1);
        }

        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            System.out.print(entry.getKey()+"  :  ");
            System.out.println(entry.getValue());
        }

    }


}
