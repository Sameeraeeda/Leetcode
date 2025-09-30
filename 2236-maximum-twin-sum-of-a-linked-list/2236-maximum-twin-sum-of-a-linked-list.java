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
    public int pairSum(ListNode head) {
        ArrayList<Integer> al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int l=0;
        int r=al.size()-1;
        int maxsum=0;
        while(l<r){
            int sum=al.get(l)+al.get(r);
            maxsum=Math.max(maxsum,sum);
            l++;
            r--;
        }
        return maxsum;
    }
}