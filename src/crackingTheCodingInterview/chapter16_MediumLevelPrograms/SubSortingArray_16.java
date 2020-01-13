package crackingTheCodingInterview.chapter16_MediumLevelPrograms;
/*
https://www.geeksforgeeks.org/minimum-length-unsorted-subarray-sorting-which-makes-the-complete-array-sorted/
 */

public class SubSortingArray_16 {

    public static void main(String[] args) {
        int[] a = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        findSubSort(a);
    }

    static void findSubSort(int[] a) {
        int n = a.length;
        int s = 0, e = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                s = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < a[i - 1]) {
                e = i;
                break;
            }
        }
        int j = 0;
        int min = a[s], max = a[s];
        for (int i = s + 1; i <= e; i++) {
            if (min > a[i])
                min = a[i];
            if (max < a[i])
                max = a[i];
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > min) {
                s = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < max) {
                e = i;
                break;
            }
        }
        System.out.println(s);
        System.out.println(e);
    }
}
