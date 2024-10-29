package online.judge.LeetCode.LinkedLists.MergeTwoSortedLists;

public class MergeTwoSortedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode result = new ListNode(0);
            ListNode head = result;
            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    result.next = new ListNode(list2.val);
                    result = result.next;
                    list2 = list2.next;
                } else if (list1.val < list2.val) {
                    result.next = new ListNode(list1.val);
                    result = result.next;
                    list1 = list1.next;
                } else {
                    result.next = new ListNode(list1.val);
                    result = result.next;
                    result.next = new ListNode(list2.val);
                    result = result.next;
                    list1 = list1.next;
                    list2 = list2.next;
                }
            }

            ListNode reminder = (list1 == null) ? list2 : list1;

            while (reminder != null) {
                result.next = new ListNode(reminder.val);
                result = result.next;
                reminder = reminder.next;
            }

            return head.next;
        }
    }

}




