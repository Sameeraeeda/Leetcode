class Solution {
    public boolean detectCapitalUse(String word) {
        int Caps=0;
        int small=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c)){
                Caps++;
            }
            else{
                small++;
            }
        }
        int n=word.length();
        if(Caps==n || small==n || Caps==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}