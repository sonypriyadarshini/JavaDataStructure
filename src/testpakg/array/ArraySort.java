package testpakg.array;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArraySort {

    public static void main(String args[]){
        sortarray();
    }

    public static void sortarray(){
        int a[] ={11,22,3,1,2,1};
        Set<Integer> sortedset = new TreeSet<>();

        for(int i=0;i<a.length;i++)
            sortedset.add(a[i]);
        for(int n:sortedset)
            System.out.println(n);

        Iterator<Integer> iterator = sortedset.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

    }
}
