class Solution {
    public int maxVowels(String s, int k) {
        HashSet hs=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int maxcount=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(hs.contains(s.charAt(i))){
                count++;
            }
        }
        maxcount=count;
        for(int i=k;i<s.length();i++){
            if(hs.contains(s.charAt(i-k))){
                count--;
            }if(hs.contains(s.charAt(i))){
                count++;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}
