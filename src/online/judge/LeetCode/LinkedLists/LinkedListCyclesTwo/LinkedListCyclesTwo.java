package online.judge.LeetCode.LinkedLists.LinkedListCyclesTwo;


import java.util.HashSet;
import java.util.Set;

public class LinkedListCyclesTwo {

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

    public ListNode detectCycleConstantSpace(ListNode head) {

        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                fastPtr = head;
                while (fastPtr != slowPtr) {
                    fastPtr = fastPtr.next;
                    slowPtr = slowPtr.next;
                }
                return slowPtr;
            }
        }

        return null;
    }

    public ListNode detectCycle(ListNode head) {

        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                Set<ListNode> set = new HashSet<>();
                ListNode ptr = head;
                while (ptr.next != null) {
                    if (!set.add(ptr)) return ptr;
                    ptr = ptr.next;
                }
            }
        }

        return null;
    }
}
