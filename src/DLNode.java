    public class DLNode {
    int val;
    DLNode next;
    DLNode prev;

    DLNode(int val, DLNode next, DLNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
    DLNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
