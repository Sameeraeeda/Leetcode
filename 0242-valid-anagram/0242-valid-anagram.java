import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'a';
            arr[ch]++;
        }
        for(int i=0;i<t.length();i++){
            int ch=t.charAt(i)-'a';
            arr[ch]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                return false;
            }
        }
        return true;
    }
}