package array.leetCode;

import java.util.*;

/*
https://leetcode.com/problems/top-k-frequent-elements/

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

 */

public class TopKFrequentElements {
    public static void main(String[] args) {

        System.out.println(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));


    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        java.util.List<Integer> res = new ArrayList<>();

        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i : nums)
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);

        List list = new LinkedList(hashMap.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }

        ArrayList<Integer> arrayList = new ArrayList<>(sortedHashMap.keySet());
        int i = arrayList.size() - 1;
        while (i >= arrayList.size() - k) {
            res.add(arrayList.get(i));
            i--;
        }
        return res;    }
}
