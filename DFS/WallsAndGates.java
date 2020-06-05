class Solution {
    public void wallsAndGates(int[][] rooms) {
        
        int count = 0;
        
        for(int i = 0; i < rooms.length; i++) {
            
            for(int j = 0; j < rooms[i].length; j++) {
                
                if(rooms[i][j] == 0) {
                    
                    dfs(rooms, i, j, 0);
                }
            }
            
        }
        
    }
    
    private void dfs(int[][] rooms, int i, int j, int count) {
        
        if(i >= rooms.length || i < 0 || j >= rooms[i].length || j < 0 || rooms[i][j] < count) {
            
            return;
        }
        
        rooms[i][j] = count;
        dfs(rooms, i+1, j, count+1);
        dfs(rooms, i-1, j, count+1);
        dfs(rooms, i, j + 1, count+1);
        dfs(rooms, i, j - 1, count+1);
        
    }
}