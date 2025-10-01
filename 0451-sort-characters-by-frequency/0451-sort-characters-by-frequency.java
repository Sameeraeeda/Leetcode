import java.util.*;

class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       for(char a:s.toCharArray()){
        map.put(a,map.getOrDefault(a,0)+1);
       }
       List<Character> ls=new ArrayList<>(map.keySet());
       ls.sort((a,b)->map.get(b)-map.get(a));
       StringBuilder sr=new StringBuilder();
       for(char a:ls){
        int b=map.get(a);
        for(int i=0;i<b;i++){
             sr.append(a);
        }
       }
       return sr.toString();
    }
}
