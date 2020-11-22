package heap;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    PriorityQueue<Integer> queue = new PriorityQueue();

    public ListNode mergeKLists(ListNode[] lists) {
       for (ListNode list: lists) {
           ListNode head = list;
           while (head != null) {
               queue.add(head.val);
               head = head.next;
           }
       }

           if (queue.size() == 0)
               return null;

           ListNode head = new ListNode(queue.poll());
           ListNode curr = head;

           while (!queue.isEmpty()) {
               curr.next = new ListNode(queue.poll());
               curr = curr.next;
           }

           return head;
    }
}
