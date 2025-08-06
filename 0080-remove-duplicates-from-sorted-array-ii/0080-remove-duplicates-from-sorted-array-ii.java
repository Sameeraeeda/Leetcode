class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=0;
        int n=nums.length;
        for(int j=1;j<n;j++){
            if(nums[i]==nums[j]){
                count++;
                if(count<=2){
                   i++;
                    nums[i] = nums[j];
                }
            }
            else{
                count=1;
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}