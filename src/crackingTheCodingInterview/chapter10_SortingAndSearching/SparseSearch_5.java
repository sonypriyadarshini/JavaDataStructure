package crackingTheCodingInterview.chapter10_SortingAndSearching;

/*
Sparse Search: Given a sorted array of strings that is interspersed with empty strings,
write a method to find the location of a given string.

    https://www.geeksforgeeks.org/sparse-search/
 */
public class SparseSearch_5 {

    public static void main(String[] args) {
        String arr[] = {"for", "geeks", "", "", "", "", "ide",
                "practice", "", "", "", "quiz"};
        String x = "for";

        System.out.println( sparseSearch(arr, x));
    }

    static int sparseSearch(String s[], String fs){
        return findStringHeper(s,fs,0,s.length-1);
    }

    static int findStringHeper(String s[],String fs,int start, int end){

            int mid= (start+end)/2;

            //find mid so that mid!= blank
            if(s[mid]==""){
                int left=mid-1;
                int right=mid+1;

                while(true){
                    if(left<start && right>end){
                        return -1;
                    }
                    if(left>=start && s[left]!=""){
                        mid=left;
                        break;
                    }
                    else if(right<=end && s[end]!=""){
                        mid=right;
                        break;
                    }

                    left--;
                    right++;
                }

            }

            if(s[mid]==fs)
                return mid;
            if(s[mid].compareTo(fs)>0)
                return findStringHeper(s,fs,0,mid-1);
            else
                return findStringHeper(s,fs,mid+1,end);

        }

}
