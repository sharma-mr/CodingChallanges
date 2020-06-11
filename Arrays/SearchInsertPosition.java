class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        int pivot = 0;
        while(left <= right) {
            
            pivot = left + (right - left)/2;
            
            if(nums[pivot] == target) {
                
                return pivot;
            }
            
            if(target < nums[pivot]) {
                
                right = pivot - 1;
            } else {
                
                left = pivot + 1;
            }
            
            
        }
        
        return left;
    }
}