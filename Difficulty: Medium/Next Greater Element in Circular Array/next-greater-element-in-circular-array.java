class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int a:arr){
            al.add(a);
        }
        for(int a:arr){
            al.add(a);
        }
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=al.size()-1;i>=0;i--){
            while(!st.isEmpty() && al.get(i)>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                res.add(-1);
            }
            else{
                res.add(st.peek());
            }
            st.push(al.get(i));
        }
        Collections.reverse(res);
        ArrayList<Integer> fin=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            fin.add(res.get(i));
        }
        return fin;
    }
}