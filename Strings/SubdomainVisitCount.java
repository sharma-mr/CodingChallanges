class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        
        Map<String, Integer> counts = new HashMap<>();
        for(String domain : cpdomains) {
            int hits = Integer.parseInt(domain.substring(0, domain.indexOf(" ")));      
            String curr = domain.substring(domain.indexOf(" ") + 1);
            while(!curr.isEmpty()) {
                counts.put(curr, counts.getOrDefault(curr, 0) + hits);
                int index = curr.indexOf(".");
                if(index != -1) {  
                    curr = curr.substring(index+1);
                } else {
                    
                    curr = "";
                }
            }
        }
        
        List<String> ans = new ArrayList<>();
        for(String key : counts.keySet()) {
            int count = counts.get(key);
            String toAdd = count + " " + key;
            ans.add(toAdd);
        }
        
        return ans;
    }
}