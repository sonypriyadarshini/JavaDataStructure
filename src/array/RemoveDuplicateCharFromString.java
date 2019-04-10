package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//>>>>>>>>>>>Incomplete
public class RemoveDuplicateCharFromString {
    public static void main(String args[]) {
        removeDupString();
    }

    public static void removeDupString(){

        String string = "abcabd";
        char[] c = string.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for(char a : c){
//            if(set.add(a)==false)
//                    System.out.println(a);
//                else
//                    set.add(a);
            if( set.add(a)==true)
                System.out.println(a);
//
        }
//        Iterator<Character> itr = set.iterator();
//        while(itr.hasNext())
//            System.out.println(itr.next());

    }





    public static void removeDup(){

        //using set
        int a[]={1,2,3,4,2,4};
        Set<Integer> set = new HashSet<>();
        for(int num:a){
            if(set.add(num)==false)
                System.out.println(num);
            else
                set.add(num);
        }

        //3 different ways of printing elements from set:

        List<Integer> l = new ArrayList<>();
        l.add(2);
        l.add(4);
        //l.remove(1);
        Iterator<Integer> iterator1 = l.iterator();
        if (l.equals(iterator1.next()))
            iterator1.remove();


        //for loop
//        for(int m:l)
        System.out.println("      sdsda sfsadfsadf       "+l);


        //iterator
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext())
            System.out.println("duplicated removed "+iterator.next());



        //foreach
        set.forEach(System.out::println);

        System.out.println("FInding number of times each element is present in an array");

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int n : a){
            if(hashMap.containsKey(n))
                hashMap.put(n,hashMap.get(n)+1);
            else
                hashMap.put(n,1);
        }
        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet())
            System.out.println("key "+entry.getKey()+" : "+entry.getValue());

    }


}
