class Solution {
    public int[] searchRange(int[] nums, int target) {
       int idx1=leftpos(nums,target);
       int idx2=rightpos(nums,target);
       if(idx1==-1 && idx2==-1){
        return new int[]{-1,-1};
       }
       return new int[]{idx1,idx2};
    }
    public int leftpos(int nums[],int target){
       int l=0;
       int r=nums.length-1;
       int index=-1;
       while(l<=r){
        int mid=l+(r-l)/2;
        
        if(nums[mid]==target){
            index=mid;
            r=mid-1;
        }
        else if(nums[mid]>target){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
       }
       return index;
    }
    public int rightpos(int nums[],int target){
       int l=0;
       int r=nums.length-1;
       int index=-1;
       while(l<=r){
        int mid=l+(r-l)/2;
        if(nums[mid]==target){
            index=mid;
            l=mid+1;
        }
        else if(nums[mid]>target){
            r=mid-1;
        }
        else{
            l=mid+1;
        }
       }
       return index;
    }
   
}