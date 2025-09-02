import java.util.Map;
import java.util.Collections;
import java.util.Arrays;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map=new HashMap<>();
       int n=strs.length;
       for(int i=0;i<n;i++){
        char arr[]=strs[i].toCharArray();
        Arrays.sort(arr);
        String word=new String(arr);
        if(!map.containsKey(word)){
            map.put(word,new ArrayList<>());
        }
            map.get(word).add(strs[i]);
    
       }
       List<List<String>> res=new ArrayList<>(map.values());
       for(List<String> grp:res){
        Collections.sort(grp);
       }
       return res;
    }
}