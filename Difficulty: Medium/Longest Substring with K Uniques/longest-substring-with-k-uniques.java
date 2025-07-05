class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int Max=-1;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.size()>k){
                char outgoing=s.charAt(left);
                map.put(outgoing,map.get(outgoing)-1);
                if(map.get(outgoing)==0){
                    map.remove(outgoing);
                }
                left++;
            }
            if(map.size()==k){
            Max=Math.max(Max,right-left+1);    
            }
            
        }
        return Max;
    }
}