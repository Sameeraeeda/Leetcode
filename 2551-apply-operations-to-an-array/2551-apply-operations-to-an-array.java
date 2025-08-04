class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=2*nums[i];
                nums[i+1]=0;
            }
        }
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                swap(nums,l,r);
                l++;
            }
        }
        return nums;
    }
    public void swap(int nums[],int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}