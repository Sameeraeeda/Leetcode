class Solution {
    public int diagonalSum(int[][] mat) {
        int rows=mat.length;
        int sum=0;
        int col=mat[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                  sum+=mat[i][j];
                }
                else if(i+j==rows-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}