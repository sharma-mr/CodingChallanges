class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n == 0) {
            
          return false;
            
        }
        
        // to prevent overflow. Set to 1 because that's the first power of 2. 2^0 = 1
        long i = 1;
        
        while(i < n) {
            
            i *= 2;
        }
        
        return i == n;
        
    }
}