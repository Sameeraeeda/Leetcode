class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char a:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==a){
                st.pop();
            }
            else{
                st.push(a);
            }
        }
        String res="";
        for(char a:st){
            res+=a;
        }
        return res;
    }
}