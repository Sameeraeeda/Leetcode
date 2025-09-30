class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sr=new StringBuilder();
        int l=0;
        int r=0;
        while(l<word1.length() && r<word2.length()){
            sr.append(word1.charAt(l));
            sr.append(word2.charAt(r));
            l++;
            r++;
        }
        while(l<word1.length()){
            sr.append(word1.charAt(l));
            l++;
        }
        while(r<word2.length()){
            sr.append(word2.charAt(r));
            r++;
        }
        return sr.toString();
    }
}