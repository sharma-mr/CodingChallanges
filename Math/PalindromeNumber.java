class Solution {
    public boolean isPalindrome(int x) {
        
        int num = x;
        int rev = 0;
        if(x < 0) {
            
            return false;
        }
        
        while(num > 0) {
            
           int r = num % 10;
           rev = rev*10 + r;
           num = num/10;
            
        }
        
        return rev == x;
    }
}