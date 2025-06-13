class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;
        int count = 0;
        ListNode curr = head;
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        if (count == k) {
            ListNode prev = null;
            curr = head;
            for (int i = 0; i < k; i++) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            head.next = reverseKGroup(curr, k);
            return prev;
        }
        return head;
    }
}
