class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                al.add(-1);
                st.push(arr[i]);
            }
            else if(st.peek()<arr[i]){
                al.add(st.peek());
                st.push(arr[i]);
            }
            else{
                al.add(st.peek());
            }
        }
        Collections.reverse(al);
        int res[]=new int[al.size()];
        int i=0;
        for(int a:al){
            res[i]=a;
            i++;
        } 
        return res;
    }
}
