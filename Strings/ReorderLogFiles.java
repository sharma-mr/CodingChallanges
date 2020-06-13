// Create two lists that will store the Letter and Digit Lists.
// Iterate through each element in the array and check if the second element is a letter or digit and add it to their respective lists.
// Sort the Letter Lists.
// Merge two Lists.
// Return the Merged List.



class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        if(logs == null || logs.length == 0) {
            
            return logs;
        }
        
        
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();
        
        for(String log : logs) {
            
           if(log.split(" ")[1].charAt(0) < 'a') {
               
               digitList.add(log);
           } else {
               
               letterList.add(log);
           }
            
        }
        
        Collections.sort(letterList, (o1, o2) -> {
            
            String[] s1 = o1.split(" ");
            String[] s2 = o2.split(" ");
            
            int n = s1.length;
            int m = s2.length;
            
            for(int i = 1; i < Math.min(n,m); i++) {
                
                if(!s1[i].equals(s2[i])) {
                    
                    return s1[i].compareTo(s2[i]);
                } 
            }
            
            return s1[0].compareTo(s2[0]);
            
        });
        
        int count = 0;
        
        while(count < letterList.size()) {
            
            logs[count] = letterList.get(count);
            count++;
            
        }
        
        int i = 0;
        
        while(i < digitList.size()) {
            
            logs[count++] = digitList.get(i++);
        }
        
        return logs;
    }
}