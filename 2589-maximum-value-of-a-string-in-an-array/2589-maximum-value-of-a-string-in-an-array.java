class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            boolean haschar=false;
            for(int j=0;j<word.length();j++){
                if(Character.isLetter(word.charAt(j))){
                   haschar=true;
                }
            }
            if(haschar){
                    int len=word.length();
                    max=Math.max(max,word.length());
            }
            else{
                int num=Integer.parseInt(word);
                max=Math.max(max,num);
            }
        }
        return max;
    }
}