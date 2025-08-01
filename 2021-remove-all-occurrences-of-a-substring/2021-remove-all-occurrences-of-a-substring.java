class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st=new Stack<>(); 
        int n=part.length();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
           if(st.size()>=n){
            StringBuilder sb=new StringBuilder();
            for(int j=st.size()-n;j<st.size();j++){
                   sb.append(st.get(j));
            }
            if(sb.toString().equals(part)){
                for(int j=0;j<n;j++){
                    st.pop();
                }
            }
           }
            
        }
        String res="";
        for(char a:st){
             res+=a;
        }
        return res;
    }
}