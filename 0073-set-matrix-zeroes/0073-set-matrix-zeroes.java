class Solution {
    public void setZeroes(int[][] matrix) {
        // Brute Force Approch
        int m = matrix.length;
    int n = matrix[0].length;
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(matrix[i][j] == 0){
          for(int k = 0; k < m; k++){
            if(matrix[k][j] != 0){
              matrix[k][j] = Integer.MAX_VALUE+3;
            }
          }
          for(int f = 0; f < n; f++){
            if(matrix[i][f] != 0){
              matrix[i][f] = Integer.MAX_VALUE+3;
            }
          }
        }
      }
    }
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(matrix[i][j] == Integer.MAX_VALUE+3){
          matrix[i][j] = 0;
        }
      }
    } 
    }
}