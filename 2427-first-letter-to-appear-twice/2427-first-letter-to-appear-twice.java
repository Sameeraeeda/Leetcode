class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> hs=new HashSet<>();
        int min_index=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                if(i<min_index){
                     min_index=i;
                }
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        return s.charAt(min_index);
    }
}