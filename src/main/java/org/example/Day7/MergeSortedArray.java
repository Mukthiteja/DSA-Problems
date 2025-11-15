package org.example.Day7;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0, 0, 0, 1, 2, 3};
        int[] nums2 = {2, 5, 6};
        int m = nums1.length;
        int n = nums2.length;
        nums2=mergeArraysGreatest(nums1,m,nums2,n);
       // nums1 = mergeArrays(nums1, m, nums2, n);
        for (int i : nums2) {
            System.out.print(i + " ");
        }
    }

    private static int[] mergeArrays(int[] nums1, int m, int[] nums2, int n) {
        int k = 0, i = 0, j = 0;
        int[] arr = new int[m + n];
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[k] = nums1[i];
                i++;
            } else {
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        if (j == n) {
            while (i < m) {
                arr[k] = nums1[i];
                i++;
                k++;
            }
        } else if (i == m) {
            while (j < n) {
                arr[k] = nums2[j];
                j++;
                k++;
            }

        }
        return arr;
    }

    private static int[] mergeArraysGreatest(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1, i = m-1, j = n-1;
        int[] arr = new int[m + n];
        while (i >=0 && j >=0) {
            if (nums1[i] > nums2[j]) {
                arr[k] = nums1[i];
                i--;
            } else {
                arr[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (i >= 0) {
            arr[k--] = nums1[i--];
        }
        while (j >= 0) {
            arr[k--] = nums2[j--];
        }
        return arr;
    }

}