class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int index = 1; index < nums.length; index++) {
            currentSum = Math.max(nums[index], currentSum + nums[index]);
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}