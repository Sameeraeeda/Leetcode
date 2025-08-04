class Solution {
    public int countHillValley(int[] nums) {
        int j=0;
       int i=1;
       int count=0;
       while(i<nums.length-1){
           int next=i+1;
           while(next<nums.length && nums[i]==nums[next]){
            next++;
           }
           if(next<nums.length){
            if(nums[i]>nums[j] && nums[i]>nums[next]){
            count++;
           }
           else if(nums[i]<nums[j] && nums[i]<nums[next]){
            count++;
           }
           }
           
           j=i;
           i=next;
       }
       return count;
    }
}