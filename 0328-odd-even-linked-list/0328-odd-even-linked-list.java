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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        ListNode res1=null;
        ListNode res2=null;
        ListNode tail1=null;
        ListNode tail2=null;
        int idx=1;
        while(temp!=null){
            ListNode newNode=new ListNode(temp.val);
            if(idx%2!=0){
                if(res1==null){
                    res1=newNode;
                    tail1=newNode;
                }
                else{
                    tail1.next=newNode;
                    tail1=tail1.next;
                }
                
            }
            else{
                if(res2==null){
                    res2=newNode;
                    tail2=newNode;
                }
                else{
                    tail2.next=newNode;
                    tail2=tail2.next;
                }
                
            }
            idx++;
            temp=temp.next;
        
        }
        tail1.next=res2;
        return res1;
    }
}