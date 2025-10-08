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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        ListNode first=null;
        ListNode sec=null;
        int l=1;
        temp=head;
        while(temp!=null){
            if(l==k){
                break;
            }
            temp=temp.next;
            l++;
        }
        first=temp;
        temp=head;
        l=1;
        while(temp!=null){
            if(l==len-k+1){
                break;
            }
            temp=temp.next;
            l++;
        }
        sec=temp;
        swap(first,sec);
        return head;
    }
    public void swap(ListNode first,ListNode sec){
        int num=first.val;
        first.val=sec.val;
        sec.val=num;
    }
}