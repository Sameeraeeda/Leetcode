class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> stringst=new Stack<>();
        Stack<Integer> numst=new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }
            else if(c=='['){
                numst.push(k);
                stringst.push(current);
                k=0;
                current = new StringBuilder();
            }
            else if(c==']'){
                int count=numst.pop();
                StringBuilder temp=stringst.pop();
                for(int i=0;i<count;i++){
                    temp.append(current);
                }
                current=temp;
            }
            else{
                current.append(c);
            }
        }
        return current.toString();
    }
}