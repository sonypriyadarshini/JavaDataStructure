package algorithm;

/*
https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/

 */

import java.util.*;

public class GreedyActivitySelection {

    public static void main(String[] args) {
        Integer s[] =  {10,12,20};
        Integer f[] =  {30,20,25};
        selectActivity(s,f);

        ArrayList<jobs> lis=new ArrayList<>();
        lis.add(new jobs(10,30));
        lis.add(new jobs(12,20));
        lis.add(new jobs(20,25));
        Collections.sort(lis);
        System.out.println(lis.get(0).stime);
    }

    static class jobs implements Comparable<jobs>{
        int stime,ftime;

        @Override
        public int compareTo(jobs job){
            if (this.ftime>job.ftime)
                return 1;
            else
                    return -1;

        }
        public jobs(int stime, int ftime){
            this.ftime=ftime;
            this.stime=stime;
        }
    }

    public static void selectActivity(Integer ar1[], Integer ar2[]){

        //sort both arrays based on ar2
//        final List<Integer> copy= Arrays.asList(ar1);
//        ArrayList<Integer> sorted = new ArrayList<>(copy);
//        Collections.sort(sorted, Comparator.comparing(s->ar2[copy.indexOf(s)]));
//        System.out.println(copy);System.out.println(sorted);


        //add both arrays to a TreeMap, so that its sorted
        Map<Integer,Integer> sortedMap=new TreeMap<>();
        for(int i=0;i<ar2.length;i++){
            sortedMap.put(ar2[i],ar1[i]);
        }
        int j=0;
        //put the elements back to the array in sorted form
        for(Map.Entry<Integer,Integer> entry:sortedMap.entrySet()){
            System.out.println(entry.getKey()+"  :  "+entry.getValue());
            ar1[j]=entry.getValue();
            ar2[j]=entry.getKey();
            j++;
        }

        j=0;
        System.out.println(j);

        //check if start of an activity is greater than equal to end of prev activity
        for(int i=1;i<ar2.length;i++){
            if(ar2[j]<=ar1[i]) {
                System.out.println(i);
                j=i;
            }
        }

    }
}
