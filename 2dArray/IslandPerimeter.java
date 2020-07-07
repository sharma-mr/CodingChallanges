class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int rowLength = grid.length - 1;
        int columnLength = grid[0].length - 1;
        int perimeter = 0;
        int up, down, right, left;
        for(int row = 0; row <= rowLength; row++) {
            for(int col = 0; col <= columnLength; col++) {
                
                if(grid[row][col] == 1) {
                    
                    if(row == 0) {
                        up = 0;
                    } else {
                        
                        up = grid[row-1][col];
                    }
                    
                    if(col == 0) {
                        
                        left = 0;
                    } else {
                        
                        left = grid[row][col-1];
                    }
                    
                    if(row == rowLength) {
                        
                        down = 0;
                    } else {
                        
                        down = grid[row+1][col];
                    }
                    
                    if(col == columnLength) {
                        
                        right = 0;
                    } else {
                        
                        right = grid[row][col+1];
                    }
                    
                    perimeter += 4 - (up+left+down+right);
                } 
                
            }
        }
        return perimeter;
    }
}