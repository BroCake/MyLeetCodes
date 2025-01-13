// https://leetcode.com/problems/merge-two-sorted-lists/

public class q21 {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode test1 = new ListNode( 0, new ListNode( 2, new ListNode(6)));
        ListNode test2 = new ListNode(-1, new ListNode( 3, new ListNode(3)));
        
        test1 = s.mergeTwoLists(test1, test2);

        while (test1 !=null){
            System.out.print(test1.val + ", ");
            test1 = test1.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}     
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode cans = new ListNode();
        ListNode ans = cans;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                cans.next = list1;
                list1 = list1.next;
            } //end if
            else {
                cans.next = list2;
                list2 = list2.next;
            } //end if
            cans = cans.next;
        } //end while
        while (list1 != null){
            cans.next = list1;
            list1 = list1.next;
            cans = cans.next;
        }
        while (list2 != null){
            cans.next = list2;
            list2 = list2.next;
            cans = cans.next;
        }
        return ans.next;
    } //end mergeTwoLists()
} //end Solution