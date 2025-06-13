/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> al=new ArrayList<>();
        while(temp!=null){
               al.add(temp.val);
               temp=temp.next;
        }
        Stack<Integer> st=new Stack<>();
        int res[]=new int[al.size()];
        for(int i=al.size()-1;i>=0;i--){
            while(!st.isEmpty() && al.get(i)>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=st.peek();
            }
            st.push(al.get(i));
        }
        return res;
    }
}