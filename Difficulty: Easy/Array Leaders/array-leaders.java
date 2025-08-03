class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                al.add(st.pop());
            }
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            if(!st.isEmpty() && st.peek()<arr[i]){
                st.push(arr[i]);
            }
        }
        if(!st.isEmpty()){
            al.add(st.peek());
        }
        
        Collections.reverse(al);
        return al;
    }
}
