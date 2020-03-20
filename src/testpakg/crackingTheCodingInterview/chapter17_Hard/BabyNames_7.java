package testpakg.crackingTheCodingInterview.chapter17_Hard;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 Baby Names; Each year, the government releases a list of the 10000 most common baby names and their frequencies
 {the number of babies with that name). The only problem with this is that some names have multiple spellings.
 For example, "John" and "Jon" are essentially the same name but would be listed separately in the list. Given two lists,
 one of names/frequencies and the other of pairs of equivalent names,
 write an atgorithm to print a new list of the true frequency of each name. Note that if John and Jon are synonyms,
 and Jon and Johnny are synonyms, then John and Johnny are synonyms,
 (it is both transitive and symmetric.) In the final list, any name can be used as the "real" name,


 EXAMPLE Input:
 Names: John (15), Jon (12), Chris (13), Kris (4), Christopher (19)
 Synonyms: {Jon, John), (John, Johnny), (Chris, Kris), {Chris, Christopher) Output: John (27), Kris (36)

 */

public class BabyNames_7 {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer > names=new LinkedHashMap<>();
        names.put("John",15);
        names.put("Jon",12);
        names.put("Chris",13);
        names.put("Kris",4);
        names.put("Christopher",19);

        LinkedHashMap<String,String> b=new LinkedHashMap<>();
        b.put("Jon","John");
        b.put("John","Johnny");
        b.put("Chris","Kris");
        b.put("Kris","Christopher");
        babayNamesArrangement(names,b);


    }

    static void babayNamesArrangement(LinkedHashMap<String,Integer > names, LinkedHashMap<String,String> b){
        LinkedHashMap<String,String> temp=new LinkedHashMap<>();
        LinkedHashMap<String,Integer> res=new LinkedHashMap<>();
        for(Map.Entry key:b.entrySet()){
            if(!temp.containsKey(key.getKey())){
                temp.put(key.getKey().toString(),key.getKey().toString());
                if(!res.containsKey(key.getKey())){
                    res.put(key.getKey().toString(),names.get(key.getKey()));
                }
            }

            if(!temp.containsKey(key.getValue())){
                temp.put(key.getValue().toString(),temp.get(key.getKey()));
                if(!res.containsKey(key.getValue())){
                    res.put( temp.get(key.getKey()),  res.get(temp.get(key.getKey()))  +  names.getOrDefault(key.getValue(),0)  );
                }
            }

        }
        System.out.println(res);
    }
}
