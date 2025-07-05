class Solution {
    public int substrCount(String s, int k) {
        // code here
        int count=0;
        int left=0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int right=0;right<s.length();right++){
            char incoming=s.charAt(right);
            map.put(incoming,map.getOrDefault(incoming,0)+1);
            int len=right-left+1;
            while(right-left+1>k){
                char outgoing=s.charAt(left);
                map.put(outgoing,map.get(outgoing)-1);
                if(map.get(outgoing)==0){
                    map.remove(outgoing);
                }
                left++;
            }
            if(right-left+1==k && map.size()==k-1){
                count++;
            }
        }
        return count;
    }
}