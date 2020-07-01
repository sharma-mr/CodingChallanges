class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        Set<String> bannedSet = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(String word : banned) {
            
            bannedSet.add(word);
        }
        
        for(String word: paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
            
            if(!bannedSet.contains(word)) {
                
                map.put(word, map.getOrDefault(word, 0) + 1);
                
            }
        }
        
        
        String result = "";
        int max = 0;
        
        for(String key : map.keySet()) {
            
            if(result.equals("") || map.get(key) > map.get(result)) {
                
                result = key;
            }
        }
        
        return result;
    }
}