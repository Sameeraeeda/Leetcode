class Solution {
    public int[] searchRange(int[] nums, int target) {
        int idx1=leftpos(nums,target);
        int idx2=rightpos(nums,target);
        int res[]=new int[2];
        res[0]=idx1;
        res[1]=idx2;
        return res;
    }
    public int leftpos(int nums[],int target){
        int l=0;
        int r=nums.length-1;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                res=mid;
                r=mid-1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
    public int rightpos(int nums[],int target){
        int l=0;
        int r=nums.length-1;
        int res=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                res=mid;
                l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
   
}