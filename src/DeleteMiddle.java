public class DeleteMiddle {
    static ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow= slow.next;
            fast = fast.next.next;
        }
        if(prev.next != null) prev.next = slow.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
