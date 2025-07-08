class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int n=arr.length;
        ArrayList<Integer> al=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && map.get(arr[i])>=map.get(st.peek())){
                st.pop();
            }
            if(st.isEmpty()){
                al.add(-1);
            }
            else{
                al.add(st.peek());
            }
            st.push(arr[i]);
        }
        Collections.reverse(al);
        return al;
    }
}