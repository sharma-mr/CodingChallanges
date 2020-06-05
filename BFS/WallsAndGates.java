class Solution {
    
     private static final int EMPTY = Integer.MAX_VALUE;
        private static final int GATE = 0;
        private static final List<int []> DIRECTIONS = Arrays.asList(
            new int[] {1, 0},
            new int[] {-1,0},
            new int[] {0,1},
            new int[] {0, -1}
            
        );
    
    
    public void wallsAndGates(int[][] rooms) {
        
       int m = rooms.length;
        if(m == 0) {
            return;
        }
        
        int n = rooms[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        for(int row = 0; row < m; row++) {
            
            for(int col = 0; col < n; col++) {
                //Push all gates into queue first
                if(rooms[row][col] == GATE) {
                    
                    queue.add(new int[] {row, col});
                }
            } 
        }
        
        while(!queue.isEmpty()) {
            
            int[] point = queue.poll();
            int row = point[0];
            int col = point[1];
            for(int[] direction : DIRECTIONS) {
                
                int r = row + direction[0];
                int c = col + direction[1];
                
                if(r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != EMPTY) {
                    
                    continue;
                }
                
                rooms[r][c] = rooms[row][col] + 1;
                queue.add(new int[] {r,c});
                
            }
            
        }
        
    }
}