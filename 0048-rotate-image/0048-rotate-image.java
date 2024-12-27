class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
    
        for(int i=0; i<n; i++){
            int temp = n-1-i;
            for(int j=0; j<n; j++){
                result[j][temp] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = result[i][j];
            }
        }
    }
}