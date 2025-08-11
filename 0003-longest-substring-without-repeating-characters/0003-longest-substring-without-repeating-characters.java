class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char upcoming=s.charAt(right);
            map.put(upcoming,map.getOrDefault(upcoming,0)+1);
            while(map.get(upcoming)>1){
                char outgoing=s.charAt(left);
                map.put(outgoing,map.get(outgoing)-1);
                if(map.get(outgoing)==0){
                    map.remove(outgoing);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
        
    }
}