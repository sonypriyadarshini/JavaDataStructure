package testpakg.amazon;

import java.util.Arrays;
//https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
public class FindTripletSum {
    public static void main(String args[]){

        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        find3Numbers(A, sum);
    }
    public static void  find3Numbers(int A[],int sum){

        int arr_size=A.length;
        Arrays.sort(A);
        for (int i = 0; i < arr_size - 2; i++) {

            // To find the other two elements, start two index variables
            // from two corners of the testpakg.array and move them toward each
            // other
            int l = i + 1; // index of the first element in the remaining elements
            int r = arr_size - 1; // index of the last element
            while (l < r) {
                if (A[i] + A[l] + A[r] == sum) {
                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
                    break;
                }
                else if (A[i] + A[l] + A[r] < sum)
                    l++;

                else
                    r--;
            }
        }

    }
}
