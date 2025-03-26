
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
class q2 {

    class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ans = new ListNode();
            ListNode c1 = l1, c2 = l2, anshd = ans;

            int n, carry = 0;

            while (c1 != null && c2 != null) {
                ListNode tmp = new ListNode();
                ans.next = tmp;
                n = c1.val + c2.val + carry;
                if (n > 9) {
                    tmp.val = n % 10;
                    carry = 1;
                } else {
                    tmp.val = n;
                    carry = 0;
                }
                ans = tmp;
                c1 = c1.next;
                c2 = c2.next;
            }
            while (c1 != null) {
                ListNode tmp = new ListNode();
                ans.next = tmp;
                n = c1.val + carry;
                if (n > 9) {
                    tmp.val = n % 10;
                    carry = 1;
                } else {
                    tmp.val = n;
                    carry = 0;
                }
                ans = tmp;
                c1 = c1.next;
            }
            while (c2 != null) {
                ListNode tmp = new ListNode();
                ans.next = tmp;
                n = c2.val + carry;
                if (n > 9) {
                    tmp.val = n % 10;
                    carry = 1;
                } else {
                    tmp.val = n;
                    carry = 0;
                }
                ans = tmp;
                c2 = c2.next;
            }
            if (carry == 1) {
                ListNode tmp = new ListNode();
                ans.next = tmp;
                tmp.val = 1;
            }
            return anshd.next;
        }
    }
}
