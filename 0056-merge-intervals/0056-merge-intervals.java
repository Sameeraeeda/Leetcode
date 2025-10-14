class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res=new ArrayList<>();
        int curr[]=intervals[0];
        res.add(curr);
        for(int i=1;i<intervals.length;i++){
            int interval[]=intervals[i];
            int currend=curr[1];
            int nextstart=interval[0];
            int nextend=interval[1];
            if(curr[1]>=nextstart){
                curr[1]=Math.max(curr[1],nextend);
            }
            else{
                curr=interval;
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}