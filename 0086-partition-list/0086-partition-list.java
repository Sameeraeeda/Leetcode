class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallhead = null, smalltail = null;
        ListNode largehead = null, largetail = null;

        while (head != null) {
            if (head.val < x) {
                if (smallhead == null) {
                    smallhead = head;
                    smalltail = head;
                } else {
                    smalltail.next = head;
                    smalltail = head;
                }
            } else {
                if (largehead == null) {
                    largehead = head;
                    largetail = head;
                } else {
                    largetail.next = head;
                    largetail = head;
                }
            }
            head = head.next;
        }

        // Important: break any old .next references to avoid cycles
        if (largetail != null) {
            largetail.next = null;
        }

        // If no nodes < x, just return large list
        if (smallhead == null) {
            return largehead;
        }

        smalltail.next = largehead;
        return smallhead;
    }
}
