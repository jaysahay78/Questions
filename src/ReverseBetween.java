public class ReverseBetween {
    static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);

        ListNode leftPre = dummy;
        ListNode curr = head;

        for(int i=0; i< left-1; i++){
            leftPre = leftPre.next;
            curr = curr.next;
        }

        ListNode subTail = curr;
        ListNode preNode = null;
        for(int i=0; i<= right-left; i++){
            ListNode nextNode = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = nextNode;
        }
        leftPre.next = preNode;
        subTail.next = curr;
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
