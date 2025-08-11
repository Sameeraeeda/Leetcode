import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            arr[idx]++;
        }
        for(char ch:t.toCharArray()){
            int idx=ch-'a';
            arr[idx]--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}