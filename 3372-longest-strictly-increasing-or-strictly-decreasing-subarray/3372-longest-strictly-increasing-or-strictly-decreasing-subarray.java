class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int up=1;
        int Max_up=1;
        int Max_down=1;
        int down=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                up++;
                down=1;
                Max_up=Math.max(Max_up,up);
            }
            else if(nums[i]<nums[i-1]){
                up=1;
                down++;
                Max_down=Math.max(Max_down,down);
            }
            else{
                up=1;
                down=1;
            }
        }
        if(Max_up>Max_down){
            return Max_up;
        }
        return Max_down;
    }
}