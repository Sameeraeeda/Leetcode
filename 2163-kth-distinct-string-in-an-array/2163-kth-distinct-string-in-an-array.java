import java.util.LinkedHashMap;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
        for(int i=0;i<arr.length;i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(String x:map.keySet()){
            if(map.get(x)==1){
               count++;
               if(count==k){
                  return x;
            }
            }

        }
        return "";
       
    }
}