class Solution {
    public int[][] transpose(int[][] matrix) {
      
       int m = matrix.length;
       int n = matrix[0].length;

       int newrows = n;
       int newcols = m;

       int ans[][]= new int[newrows][newcols];

       for(int row=0; row<m; row++){
        for(int col=0; col<n; col++){
           ans[col][row]=matrix[row][col];
        }
       }
      
       return ans;
    }
}