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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
       while(temp!=null){
        st.push(temp.val);
        temp=temp.next;
       }
       ListNode dummy=null;
       ListNode tail=null;
       while(!st.isEmpty()){
        ListNode newNode=new ListNode(st.peek());
        if(dummy==null){
              dummy=newNode;
              tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        st.pop();
       }
       return isPalindromeres(dummy,head);
    }
    public static boolean isPalindromeres(ListNode dummy,ListNode head){
        ListNode temp1=dummy;
        ListNode temp2=head;
        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}