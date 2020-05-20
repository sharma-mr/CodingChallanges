class ReverseWords {
    public String reverseWords(String s) {
        
        s.trim();
        
        String[] arr = s.split("\\s+");
        
        int start = 0;
        int end = arr.length - 1;
        
        while(start < end) {
            
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
         String joinedString = String.join(" ", arr);
        return joinedString.trim();
        
    }
}