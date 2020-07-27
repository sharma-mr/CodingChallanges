class Solution {
    public String lastSubstring(String s) {
        
        int length = s.length();
        int firstPointer = 0;
        int secondPointer = 1;
        int common = 0;
        while(secondPointer + common < length) {
            if (s.charAt(firstPointer+common) == s.charAt(secondPointer+common)){
                common++;
                continue;
            }
            if (s.charAt(firstPointer+common) > s.charAt(secondPointer+common)){
                secondPointer++;
            } else {
                firstPointer = secondPointer;
                secondPointer = firstPointer + 1;
            }
            common = 0;
        }
        
        return s.substring(firstPointer);
    }
}