package online.judge.LeetCode.LinkedLists.LinkedListsCycles;

public class LinkedListCycles {

    public static void main(String[] args) {

    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode fstPtr = head;
            ListNode slowPtr = head;

            while (fstPtr != null && fstPtr.next != null) {
                fstPtr = fstPtr.next.next;
                slowPtr = slowPtr.next;
                if (fstPtr == slowPtr) return true;
            }

            return false;
        }
    }


}
