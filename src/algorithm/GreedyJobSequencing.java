package algorithm;

import java.util.*;

/*
https://medium.com/@mukeshsingal/greedy-job-sequencing-problem-in-java-38a5e664d540
*/
public class GreedyJobSequencing {
    public static void main(String[] args) {

        GreedyJobSequencing jobSequencing = new GreedyJobSequencing();
        ArrayList<Job> jobs = new ArrayList<Job>();
        jobs.add(new Job('a', 2, 100));
        jobs.add(new Job('b', 1, 19));
        jobs.add(new Job('c', 2, 27));
        jobs.add(new Job('d', 1, 25));
        jobs.add(new Job('e', 3, 15));

        Collections.sort(jobs);


        for (Job job : jobs) {
            System.out.println(job.id + " - " + job.profit+" - "+job.deadline);
        }
        System.out.println();
        jobSequencing.jobSequence(jobs, jobs.size());

    }


    static class Job implements Comparable<Job> {
        char id;
        int deadline;
        int profit;

        @Override
        public int compareTo(Job otherJob) {
            return otherJob.profit - this.profit;
        }

        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jobSequence(ArrayList<Job> jobs, int size){
        boolean slot[]=new boolean[size];
        int res[]=new int[size];

        for(int i=0;i<size;i++)
            slot[i]=false;

        for(int i=0;i<size;i++){
            for(int j = jobs.get(i).deadline-1; j>=0;j--){
                if(slot[j]==false){
                    res[j]=i;
                    slot[j]=true;
                    break;
                }
            }
        }
        for(int i=0;i<size;i++){
            if(slot[i])
            System.out.println(jobs.get(res[i]).id);
        }

    }


}
