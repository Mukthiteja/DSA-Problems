package org.example.Day26;

/*
Minimum Operations to Make Median of Array Equal to K
 */

import java.util.Arrays;

public class MinimumOperationMedianEK {
    public static void main(String[] args) {
        int[] arr={2,4,5,1,5};
        System.out.println(minOperationsToMakeMedianK(arr,8));
    }
    public static long minOperationsToMakeMedianK(int[] nums, int k) {

        int n=nums.length;
        int mid =n/2;
        Arrays.sort(nums);
        long oper=Math.abs(nums[mid]-k);
        if (nums[mid] > k) {
            for (int i = mid - 1; i >= 0 && nums[i] > k; i--) {
                oper += nums[i] - k;
            }
        } else if (nums[mid] < k) {
            for (int i = mid + 1; i < n && nums[i] < k; i++) {
                oper += k - nums[i];
            }
        }
        return oper;
    }
}
