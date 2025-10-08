class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        int len=s.length()/k;
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i+=len){
            String sub1=s.substring(i,i+len);
            String sub2=t.substring(i,i+len);
            map1.put(sub1,map1.getOrDefault(sub1,0)+1);
            map2.put(sub2,map2.getOrDefault(sub2,0)+1);
        }
        return map1.equals(map2);
    }
}