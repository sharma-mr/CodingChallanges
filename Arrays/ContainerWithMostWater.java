class Solution {
    public int maxArea(int[] height) {
        
        int start = 0, end = height.length - 1, max = 0, min = 0;
        while(start < end) {
            
            min = Math.min(height[start], height[end]);
            max = Math.max(max, min * (end-start));
            if(height[start] < height[end]) {
                start++;
            } else {
                
                end--;
            }
            
        }
        
        return max;
    }
}