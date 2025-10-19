class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int Maxlen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char a=s.charAt(right);
            map.put(a,map.getOrDefault(a,0)+1);
            while(map.containsKey(a) && map.get(a)>1){
                char b=s.charAt(left);
                map.put(b,map.getOrDefault(b,0)-1);
                if(map.get(b)==0){
                    map.remove(b);
                }
                left++;
            }
            Maxlen=Math.max(Maxlen,right-left+1);
        }
        return Maxlen;

    }
    
}