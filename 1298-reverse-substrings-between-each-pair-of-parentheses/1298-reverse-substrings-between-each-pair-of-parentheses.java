class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char a:s.toCharArray()){
            if(a==')'){
              StringBuilder rev=new StringBuilder();
              while(!st.isEmpty() && st.peek()!='('){
                rev.append(st.pop());
              }
              st.pop();
              for(char b:rev.toString().toCharArray()){
                st.push(b);
              }
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