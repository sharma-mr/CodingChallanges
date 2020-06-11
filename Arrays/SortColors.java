class Solution {
    public void sortColors(int[] nums) {
        
        int i = 0, count0 = 0, count1 = 0, count2=0;
        
        for(i = 0; i < nums.length; i++) {
            
            switch(nums[i]) {
                
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                    
            }
        }
       
        //Update the array
        i = 0;
        while(count0 > 0) {
         
            nums[i++] = 0;
            count0--;
            
        }
        
        while(count1 > 0) {
            
            nums[i++] = 1;
            count1--;
        }
        
        while(count2 > 0) {
            nums[i++] = 2;
            count2--;
        }
        
    }
}