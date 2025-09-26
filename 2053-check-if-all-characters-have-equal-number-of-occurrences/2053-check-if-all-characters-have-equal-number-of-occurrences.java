class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char a: s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        HashSet<Integer> hs=new HashSet<>(map.values());
        if(hs.size()==1){
            return true;
        }
        return false;
    }
}