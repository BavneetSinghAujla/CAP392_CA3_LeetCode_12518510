class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int real_sum = n * (n + 1) / 2;
        int nums_sum = 0;
        for(int i = 0; i < nums.length; i++){
            nums_sum += nums[i];
        }
        return real_sum - nums_sum;
    }
}
