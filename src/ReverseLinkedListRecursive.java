public class ReverseLinkedListRecursive {
    static ListNode reverse(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {

    }
}
