import java.util.HashMap;
import java.util.List;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String a:arr1){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(String a:arr2){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<String> ls=new ArrayList<>();
        for(String word:map.keySet()){
            int b=map.get(word);
            if(b==1){
             ls.add(word);
            }
        }
        String arr[]=new String[ls.size()];
        int i=0;
        for(String a:ls){
            arr[i]=a;
            i++;
        }
        return arr;
    }
}