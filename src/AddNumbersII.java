public class AddNumbersII {
    static ListNode addNumbers(ListNode l1, ListNode l2) {
        l1 = ReverseLinkedListIterative.reverseIterative(l1);
        l2 = ReverseLinkedListIterative.reverseIterative(l2);
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;
        while(l1 != null || l2!= null || carry != 0){
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;
            int sum = digit1 + digit2 + carry;
            int digit = sum%10;
            carry = sum/10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ListNode result = head.next;
        head.next = null;
        return ReverseLinkedListIterative.reverseIterative(result);
    }
}
