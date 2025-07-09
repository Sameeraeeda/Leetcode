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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode prev=head;
        ListNode curr=head.next;
        int pos=1;
        while(curr!=null && curr.next!=null){
            int preval=prev.val;
            int currval=curr.val;
            int nextval=curr.next.val;
            if(preval>currval && currval<nextval ||
            preval<currval && currval>nextval){
                al.add(pos);
            }
            prev=prev.next;
            curr=curr.next;
            pos++;
        }
        if(al.size()<2){
            return new int[]{-1,-1};
        }
        int Min=Integer.MAX_VALUE;
        for(int i=1;i<al.size();i++){
            Min=Math.min(Min,al.get(i)-al.get(i-1));
        }
        int Max=al.get(al.size()-1)-al.get(0);
        return new int[]{Min,Max};
    }
}