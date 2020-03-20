package testpakg.array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//find count of each element
public class FindEachElementCount {
    public static void main(String args[]){
        int ar[] = {1,33,32,2,4,2,3,3,4,5,6};
        FindEachElementCount findEachElementCount = new FindEachElementCount();
        findEachElementCount.findElementCount(ar);
    }

    public void findElementCount(int arr[]){
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        for(int i:arr){
            if(hashMap.containsKey(i))
                hashMap.put(i,hashMap.get(i)+1);
            else
                hashMap.put(i,1);
        }
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
