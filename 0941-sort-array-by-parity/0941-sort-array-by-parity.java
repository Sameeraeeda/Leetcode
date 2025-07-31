class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int l=0;
       for(int r=0;r<nums.length;r++){
        if(nums[r]%2==0){
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