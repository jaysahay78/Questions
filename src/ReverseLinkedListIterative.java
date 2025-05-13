public class ReverseLinkedListIterative {
    static ListNode reverseIterative(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ans = new ListNode(head.val);
        ListNode temp = head;
        while(temp.next != null){
            ListNode newNode = new ListNode(temp.next.val);
            newNode.next = ans;
            ans = newNode;
            temp = temp.next;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
