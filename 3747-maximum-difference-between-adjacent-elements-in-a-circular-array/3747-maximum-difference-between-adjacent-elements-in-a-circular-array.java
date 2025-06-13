class Solution {
    public int maxAdjacentDistance(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int a:nums){
            al.add(a);
        }
        al.add(nums[0]);
        int Max=Integer.MIN_VALUE;
        for(int i=1;i<al.size();i++){
            int diff=Math.abs(al.get(i)-al.get(i-1));
            if(diff>Max){
                Max=diff;
            }
        }
        return Max;
    }
}