class Solution {
    public int[] countBits(int n) {
       int res[]=new int[n+1];
       res[0]=0;
       for(int i=1;i<res.length;i++){
        int count=0;
        int idx=i;
        while(idx!=0){
            count+=(idx&1);
            idx=idx>>>1;
        }
        res[i]=count;
       } 
       return res;
    }
}