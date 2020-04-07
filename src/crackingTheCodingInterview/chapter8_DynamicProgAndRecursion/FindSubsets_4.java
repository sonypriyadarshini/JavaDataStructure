package crackingTheCodingInterview.chapter8_DynamicProgAndRecursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Power Set: Write a method to return all subsets of a set. handle the case where there are duplicate values in an array

https://leetcode.com/problems/subsets-ii/discuss/434366/Java%3A-100-Time-and-Space
http://www.goodtecher.com/leetcode-78-subsets-java/
 */
public class FindSubsets_4 {

    public static void main(String[] args) {
        int arr[]={1,2,2    };
        List<List<Integer>> list= listfindPowerSet(arr);
        System.out.println(list);
    }

    static List<List<Integer>> listfindPowerSet(int[] arr){
        List<List<Integer>> list= new LinkedList<>();
        List<Integer> subsetList=new LinkedList<>();
//        Arrays.sort(arr);
        findSubSet(list,subsetList,arr,0);
        return list;
    }

    static void findSubSet(List<List<Integer>> list,List<Integer> subsetList,int arr[],int start){
        list.add(subsetList);
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1])
                continue;
            subsetList.add(arr[i]);
            findSubSet(list,new ArrayList<>(subsetList),arr,i+1);
            //using backtracking here:
            subsetList.remove(subsetList.size()-1);
        }

    }
}
