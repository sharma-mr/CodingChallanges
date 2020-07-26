class Solution {
    public boolean isRobotBounded(String instructions) {
        //dir can be 1 = North, 2 = East, 3 = South, 4 = West.
        int up_down = 0;
        int right_left = 0;
        int direction = 1;
        
        for(char c : instructions.toCharArray()) {
            
            if(c == 'G') {
                
                if(direction == 1) {
                    up_down++;
                }
                
                if(direction == 2) {
                    right_left++;
                }
                
                if(direction == 3) {
                    up_down--;     
                }
                
                if(direction == 4) {
                    right_left--;     
                }
            }
            
            if(c == 'L') {
                
                direction = direction == 1 ? 4 : direction - 1;
            }
            
            if(c == 'R') {
                
                direction = direction == 4 ? 1 : direction + 1;
            }
            
        }
        
        return up_down == 0 && right_left == 0 || direction > 1;
    }
}