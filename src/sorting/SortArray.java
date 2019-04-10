package sorting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortArray {
    public static void main(String args[]) {
        sortarray();
    }

    public static void sortarray(){
        int a[] ={1,2,3,1,2,1};
        Set<Integer> sortedset = new HashSet<>();
        Set<Integer> sortedlinkedset = new LinkedHashSet<>();

        for(int i=0;i<a.length;i++)
            sortedlinkedset.add(a[i]);
        for(int n:sortedlinkedset)
            System.out.println(n);

        for(int i=0;i<a.length;i++)
            sortedset.add(a[i]);
        for(int n:sortedset)
            System.out.println(n);

        Iterator<Integer> iterator = sortedset.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

    }
}
