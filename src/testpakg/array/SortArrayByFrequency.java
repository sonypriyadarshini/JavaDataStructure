package testpakg.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortArrayByFrequency {

    public static void main(String args[]){
        int ar[] = {1,33,32,3,3,2,4,2,2,2,2,3,3,3,4,5,6};
        sortElement(ar);
    }

    public static void sortElement(int arr[]){
        HashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        for(int i:arr){
            if(hashMap.containsKey(i))
                hashMap.put(i,hashMap.get(i)+1);
            else
                hashMap.put(i,1);
        }

        List<Map.Entry<Integer, Integer> > list = new LinkedList<>(hashMap.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }

        });


        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        for (Map.Entry<Integer, Integer> en : temp.entrySet()) {
            for(int i=0;i< en.getValue();i++)
                System.out.println(en.getKey());
//            System.out.println("Key = " + en.getKey() +
//                    ", Value = " + en.getValue());
        }
    }
}
