class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            int idx=indices[i];
            arr[idx]=s.charAt(i);
        }
        String res="";
        for(char a:arr){
            res+=a;
        }
        return res;
    }
}