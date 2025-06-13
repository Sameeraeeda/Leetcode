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
    public ListNode modifiedList(int[] nums, ListNode head) {
         HashSet<Integer> al = new HashSet<>();
        for(int a:nums){
            al.add(a);
        }
        ListNode res=null;
        ListNode tail=null;
        ListNode temp=head;
        while(temp!=null){
            if(!al.contains(temp.val)){
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