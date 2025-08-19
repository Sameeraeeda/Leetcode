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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int a=len(head);
        int check=a-n+1;
        int count=1;
        if(a==n){
            return head.next;
        }
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(count+1==check){
                temp.next=temp.next.next;
                count++;
            }
            else{
                count++;
                temp=temp.next;
            }
        }
        return head;
    }
    public static int len(ListNode head){
        ListNode temp1=head;
        int len=0;
        while(temp1!=null){
            len++;
            temp1=temp1.next;
        }
        return len;
    }
}