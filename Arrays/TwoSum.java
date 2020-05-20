
//https://leetcode.com/problems/two-sum
//Time complexity : O(n)
//Space complexity : O(n)
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        Map<Integer,Integer> differenceMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int difference = target - nums[i];
            if(differenceMap.containsKey(nums[i])) {
                result[0] = differenceMap.get(nums[i]);
                result[1] = i;
            }
            differenceMap.put(difference, i);
        }
        return result;
    }
}