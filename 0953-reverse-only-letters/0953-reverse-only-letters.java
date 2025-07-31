class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(Character.isLetter(chars[l])&&Character.isLetter(chars[r])){
                char temp=chars[l];
                chars[l]=chars[r];
                chars[r]=temp;
                l++;
                r--;
            }
            else if(Character.isLetter(chars[l])){
                r--;
            }
            else{
                l++;
            }
        }
        return new String(chars);
    }
}