class Solution {
    public void setZeroes(int[][] matrix) {
        // Brute Force Approch
        int m = matrix.length;
    int n = matrix[0].length;
    boolean[][] result = new boolean[m][n];
    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(matrix[i][j] == 0){
          result[i][j] = true;
        }else{
          result[i][j] = false;
        }
      }
    }

    for(int i = 0; i < m; i++){
      for(int j = 0; j < n; j++){
        if(result[i][j] == true){
          for(int k = 0; k < m; k++){
              matrix[k][j] = 0;      
          }
          for(int f = 0; f < n; f++){
              matrix[i][f] = 0;
          }
        }
      }
    }
    }
}