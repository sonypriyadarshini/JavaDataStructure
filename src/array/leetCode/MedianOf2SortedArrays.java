package array.leetCode;
/*
https://leetcode.com/problems/median-of-two-sorted-arrays/
https://www.youtube.com/watch?v=LPFhl65R7ww

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.
Example:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */

public class MedianOf2SortedArrays {

    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int xlength = nums1.length;
        int ylength = nums2.length;
        int partitionX, partitionY;

        int start = 0;
        int end = xlength;
        int xMaxLeft, yMaxLeft, xMinRight, yMinRight;

        while (start <= end) {
            partitionX = (start + end) / 2;
            partitionY = (xlength + ylength + 1) / 2 - partitionX;

            xMaxLeft = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            xMinRight = (partitionX == xlength) ? Integer.MAX_VALUE : nums1[partitionX];

            yMaxLeft = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            yMinRight = (partitionY == ylength) ? Integer.MAX_VALUE : nums2[partitionY];

            if (xMaxLeft <= yMinRight && yMaxLeft <= xMinRight) {
                if ((xlength + ylength) % 2 == 0)
                    return ((double) Math.min(xMinRight, yMinRight) + Math.max(xMaxLeft, yMaxLeft)) / 2;
                else
                    return (double) Math.max(xMaxLeft, yMaxLeft);
            } else if (xMaxLeft > yMinRight) {
                end = partitionX - 1;
            } else {
                start = partitionX + 1;
            }
        }
        throw new IllegalArgumentException();
    }

}
