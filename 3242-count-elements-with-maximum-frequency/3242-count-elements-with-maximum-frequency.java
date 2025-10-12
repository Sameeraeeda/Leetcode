class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int max=0;
        for(int a:map.keySet()){
            int b=map.get(a);
            if(b>max){
                max=b;
            }
        }
        int count=0;
        for(int a:nums){
            if(map.get(a)==max){
                count++;
            }
        }
        return count;
    }
}