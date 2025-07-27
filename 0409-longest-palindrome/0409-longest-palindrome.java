import java.util.HashMap;
class Solution {
    public int longestPalindrome(String s) {
        char arr[]=s.toCharArray();
        int length=0;
        boolean isfound=false;
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(char i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.values()){
            if(i%2==0){
                length+=i;
            }
            else{
                int b=i-1;
                length+=b;
                isfound=true;
            }
        }
        if(isfound){
            length+=1;
        }
        return length;
    }
}