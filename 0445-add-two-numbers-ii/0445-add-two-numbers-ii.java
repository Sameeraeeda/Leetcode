import java.math.BigInteger;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1 = "";
        String num2 = "";
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while (temp1 != null) {
            num1 += temp1.val;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            num2 += temp2.val;
            temp2 = temp2.next;
        }
        BigInteger one = new BigInteger(num1);
        BigInteger two = new BigInteger(num2);
        BigInteger sum = one.add(two);
        String val = sum.toString();
        ListNode res = null;
        ListNode tail = null;
        for (int i = 0; i < val.length(); i++) {
            int a = val.charAt(i) - '0';
            ListNode newNode = new ListNode(a);
            if (res == null) {
                res = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return res;
    }
}
