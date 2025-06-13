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
    public ListNode removeElements(ListNode head, int val) {
       ListNode res=null;
       ListNode tail=null;
       ListNode temp=head;
       while(temp!=null){
        if(temp.val!=val){
            ListNode newNode=new ListNode(temp.val);
            if(res==null){
                res=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        temp=temp.next;
       }
       return res;
    }
}
