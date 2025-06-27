class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            while(!st.isEmpty() && st.peek().val<temp.val){
                 st.pop();
            }
            st.push(temp);
            temp=temp.next;
        }
        ListNode newHead=null;
        while (!st.isEmpty()) {
            ListNode curr = st.pop();
            curr.next = newHead;
            newHead = curr;
        }
        return newHead;
    }
}
