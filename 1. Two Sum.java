///Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
///You may assume that each input would have exactly one solution, and you may not use the same element twice.
///You can return the answer in any order.


import java.util.Arrays;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1};
        int[] org = Arrays.copyOf(nums, nums.length);
        int i = 0, j = nums.length - 1, a;

        Arrays.sort(nums);

        while (nums[i] + nums[j] != target){
            if(nums[i] + nums[j] < target)
            i++;
            else
            j--;
        }
        for (a = 0; a < org.length; a++) {
            if (org[a] == nums[i]) {
                ans[0] = a;
                break;
            }
        }
        for (a = 0; a < org.length; a++) {
            if (org[a] == nums[j] && ans[0]!= a) {
                ans[1] = a;
                break;
            }
        }
        return ans;
    }
}
