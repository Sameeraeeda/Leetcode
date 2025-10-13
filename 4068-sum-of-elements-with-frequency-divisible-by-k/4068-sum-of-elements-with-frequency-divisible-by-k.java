class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])%k==0){
                sum+=nums[i];
            }
        }
        return sum;
    }
}