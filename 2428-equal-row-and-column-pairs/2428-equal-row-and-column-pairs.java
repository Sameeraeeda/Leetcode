class Solution {
    public int equalPairs(int[][] grid) {
        Map<String,Integer> map=new HashMap<>();
        int n=grid.length;
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[i][j]).append(',');
            }
          map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        }
        int count=0;
        for(int j=0;j<n;j++){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i++){
                sb.append(grid[i][j]).append(',');
            }
            count+=map.getOrDefault(sb.toString(),0);
        }
        return count;
    }
}