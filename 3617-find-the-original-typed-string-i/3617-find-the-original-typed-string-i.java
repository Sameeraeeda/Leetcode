class Solution {
    public int possibleStringCount(String word) {
        char arr[]=new char[26];
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                int idx=word.charAt(i)-'a';
                arr[idx]++;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                count+=arr[i];
            }
        }
        return count+1;
    }
}