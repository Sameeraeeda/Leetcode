class Solution {
    public int longestContinuousSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        int count=1;
        int Max=0;
        for(int i=1;i<s.length();i++){
           if(s.charAt(i)-s.charAt(i-1)==1){
            count++;
           }
           else{
            count=1;
           }
           Max=Math.max(Max,count);
        }
        return Max;
    }
}