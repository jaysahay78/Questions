public class InsertNodeAtKthPositionDLL {

    static DLNode insertBeforeHead(DLNode head, int val){
        DLNode newHead = new DLNode(val, head, null);
        head.prev = newHead;
        newHead.next = head;
        return newHead;
    }

    static DLNode insertBeforeTail(DLNode head, int val){
        DLNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        DLNode back = temp.prev;
        DLNode newHead = new DLNode(val, temp, back);
        back.next = newHead;
        temp.prev = newHead;
        return head;
    }

    static DLNode insertBeforeKthElement(DLNode head, int k, int val){
        if(k == 1) return insertBeforeHead(head, val);
        DLNode temp = head;
        int count = 0;
        while(temp != null) {
            if(count == k) break;
            temp = temp.next;
        }
        DLNode back = temp.prev;

        DLNode newNode = new DLNode(val, temp, back);
        back.next = newNode;
        temp.prev = newNode;
        return head;
    }


    public static void main(String[] args) {}
}
