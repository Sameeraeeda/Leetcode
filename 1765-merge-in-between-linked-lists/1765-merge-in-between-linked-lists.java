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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count=0;
        ListNode head=list2;
        while(head.next!=null){
            head=head.next;
        }
        ListNode temp=list1;
        int count_1=0;
        ListNode temp1=list1;
        while(count_1!=b+1){
            count_1++;
            temp1=temp1.next;

        }
        while(count+1!=a){
            count++;
            temp=temp.next;
        }
        temp.next=list2;
        head.next=temp1;
        return list1;
    }
  
}