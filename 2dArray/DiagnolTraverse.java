class DiagnolTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        //null check
        if(matrix == null || matrix.length == 0 ) {
            return new int[0];
        }
        
        int N = matrix.length; //number of rows
        int M = matrix[0].length; // number of columns
        int result[] = new int[N*M];
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();
            
            
        //Outer loop to iterate the head of the diagnol. The head of the diagnol will be the first row or the last column
        for(int d = 0; d<N+M-1; d++) {
            
            intermediate.clear();
            //Calculate the head of the diagnol. It can be either from the first row or then from the last column and then we will iterate the elements present in the diagnol
            int r = d<M ? 0 : d-M+1;
            int c = d<M ? d : M-1;
            
            while(r < N && c > -1) {
                
                intermediate.add(matrix[r][c]);
                ++r;
                --c;
            }
            
            if(d % 2 == 0) {
                Collections.reverse(intermediate);
            }
            
            for(int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
            
        }
        
        return result;
            
    }
}