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
        int count=0;
        while(temp!=null){
           count++;
           temp=temp.next;
        }
        ListNode swap1=null;
        ListNode swap2=null;
        temp=head;
        int x=k;
        int cnt=0;
        int y=count-k+1;
        while(temp!=null){
           cnt++;
           if(cnt==x){
            swap1=temp;
           }
           if(cnt==y){
            swap2=temp;
           }
           temp=temp.next;
        }
       swap(swap1,swap2);
       return head;
    }
     public static void swap(ListNode swap1,ListNode swap2){
        int temp = swap1.val;
    swap1.val = swap2.val;
    swap2.val = temp;
     }

}