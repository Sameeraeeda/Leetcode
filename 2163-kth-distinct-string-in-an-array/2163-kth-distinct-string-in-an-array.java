import java.util.LinkedHashMap;
class Solution {
    public String kthDistinct(String[] arr, int k) {
       LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
       for(String a:arr){
        map.put(a,map.getOrDefault(a,0)+1);
       }
       int count=0;
       for(String a:map.keySet()){
        if(map.get(a)==1){
            count++;
            if(count==k){
                return a;
            }
        }
       }
       return "";
       
    }
}