class Solution {
    public boolean isPossible(int[] piles,int h,int k){
        
       for(int i=0;i<piles.length;i++){
        int val=piles[i]/k;
        if(piles[i]%k!=0){
            val++;
        }
        h-=val;
        if(h<0){
            return false;
        }
       }
       return true;
       
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=1000000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(piles,h,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}