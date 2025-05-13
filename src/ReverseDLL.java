public class ReverseDLL {
    static DLNode reverseDll(DLNode head) {
        if(head == null || head.next == null) return head;

        DLNode back = null;
        DLNode cur = head;
        while(cur != null) {
            back = cur.prev;
            cur.prev = cur.next;
            cur.next = back;
            cur = cur.prev;
        }
        return back.prev;
    }

    public static void main(String[] args) {}
}
