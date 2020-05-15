package com.2dArray;

/**
 * https://leetcode.com/problems/spiral-matrix/
 * Time complexity : O(N)
 * Space complexity : O(1)
 */
public class SpiralMatrix {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> nums = new ArrayList<Integer>();
    
        if(matrix == null || matrix.length == 0) {
            return nums;
        }
     
        int top = 0; //for top to botton traversal
        int bottom = matrix.length -1; //for bottom to top traversal
        int left = 0; //for right to left traversal
        int right = matrix[0].length - 1; // for left to right traversal
        
        int size = matrix.length * matrix[0].length;
        
        while(nums.size() < size) {
            
            for(int i = left; i<= right && nums.size() < size; i++) {
                nums.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i<= bottom && nums.size() < size; i++) {
                nums.add(matrix[i][right]);
            }
            right--;
            for(int i = right; i>= left && nums.size() < size; i--) {
                nums.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i = bottom; i>= top && nums.size() < size; i--) {
                nums.add(matrix[i][left]);
            }
            left++;
            
        }
        
        return nums;
        
        
    }
}
