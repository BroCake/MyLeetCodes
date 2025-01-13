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
