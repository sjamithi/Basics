import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SortLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode sortList(ListNode head) {
        if (head == null)
            return null;
        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(list);
        head = new ListNode(list.get(0));
        temp = head;
        for(int i=1; i< list.size(); i++) {
            temp.next = new ListNode(list.get(i));
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(3);
        l.next = new ListNode(1);
        SortLinkedList sortLinkedList = new SortLinkedList();
        sortLinkedList.sortList(l);
    }
}