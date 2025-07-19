class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");
        HashSet<String> bannedwords=new HashSet<String>();
        for(String word:banned){
            bannedwords.add(word);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(String a:words){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int max=0;
        String res="";
        for(String a:map.keySet()){
            int b=map.get(a);
            if(!bannedwords.contains(a) && b>max){
                max=b;
                res=a;
            }
        }
          return res;
    }
}