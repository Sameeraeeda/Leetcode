class Solution {
    public int maximumDifference(int[] nums) {
        int Max_diff=-1;
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!st.isEmpty() && st.peek()>nums[i]){
                Max_diff=Math.max(Max_diff,st.peek()-nums[i]);

            }
            if(st.isEmpty()){
                st.push(nums[i]);
            }
              if(nums[i]>st.peek()){
                    st.push(nums[i]);
              }
            
           
        }
        return Max_diff;
    }
}