package algorithmProblems;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = new ListNode(-1,head);
        removeNthFromEndx(head, n);
        return head.next;
    }

    public int removeNthFromEndx(ListNode head, int n) {
        if (head.next == null) return 0;
        int distanceToEnd = removeNthFromEndx(head.next, n);
        if (distanceToEnd == n - 1)
        {
            head.next = head.next.next;
        }
        return distanceToEnd + 1;
    }

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
}
