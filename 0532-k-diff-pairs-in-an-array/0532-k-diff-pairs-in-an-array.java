class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        if(k==0){
            for(int a:map.keySet()){
                if(map.get(a)>1){
                    count++;
                }
            }
        }
        else{
            for(int a:nums){
                hs.add(a);
            }
            for(int a:hs){
                if(hs.contains(a+k)){
                    count++;
                }
            }
        }
        return count;
    }
}