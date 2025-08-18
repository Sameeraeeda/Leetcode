import java.util.HashMap;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int num:nums){
            map.put(num,false);
        }
        int max=0;
        for(int num:nums){
            if(map.get(num)){
                continue;
            }
            int currnum=num+1;
            int currlen=1;
            while(map.containsKey(currnum) && !map.get(currnum)){
                currlen++;
                map.put(currnum,true);
                currnum++;
            }
            int prev=num-1;
            while(map.containsKey(prev) && !map.get(prev)){
                currlen++;
                map.put(prev,true);
                prev--;
            }
            max=Math.max(max,currlen);
        }
        return max;
        
    }
}
