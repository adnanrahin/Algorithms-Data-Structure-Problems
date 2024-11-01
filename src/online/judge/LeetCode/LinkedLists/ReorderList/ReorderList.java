package online.judge.LeetCode.LinkedLists.ReorderList;

import java.util.Deque;
import java.util.LinkedList;

public class ReorderList {

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

    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        ListNode temp = head;

        Deque<ListNode> deque = new LinkedList<>();

        while (temp != null) {
            ListNode prev = temp;
            deque.add(temp);
            temp = temp.next;
            prev.next = null;
        }

        while (!deque.isEmpty()) {
            head.next = deque.removeFirst();
            head = head.next;
            if (!deque.isEmpty()) {
                head.next = deque.removeLast();
                head = head.next;
            }
        }
    }
}
