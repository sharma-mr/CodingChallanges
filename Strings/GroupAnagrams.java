class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i< strs.length; i++) {
            
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            
            if(map.containsKey(sorted)) {
               
                map.get(sorted).add(strs[i]);
                
            } else {
                
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(sorted, temp);
                
            }
            
        }
        
        
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            
            result.add(entry.getValue());
        }
        
        
        return result;
    }
}