public class RotateList {
    static ListNode rotateList(ListNode head, int k) {
        int length =1;
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next !=null){
            temp = temp.next;
            length++;
        }
        temp.next = head;
        ListNode newTail = head;
        k = k%length;
        int count = 0;
        for(int i = 0; i<length-k-1; i++){
            newTail = newTail.next;
        }
        ListNode ans = newTail.next;
        newTail.next = null;
        return ans;
    }

    public static void main(String[] args) {

    }
}
