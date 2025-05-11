public class DeleteKthElementDLL {
    static void deleteHead(DLNode head) {
        if(head == null || head.next == null) return;
        DLNode back = head;
        head = head.next;
        head.prev = null;
        back.next = null;

    }

    static void deleteTail(DLNode head){
        if(head == null || head.next == null) return;
        DLNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        DLNode back = temp.prev;
        back.next = null;
        temp.prev = null;
    }

    static void deleteKthElement(DLNode head, int k){
        if(head == null || head.next == null) return;
        DLNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        DLNode back = temp.prev;
        DLNode front = temp.next;
        if(back == null && front == null) return;
        else if(back == null) {deleteHead(head); return;}
        else if(front == null) {deleteTail(head); return;}

        back.next = front;
        front.prev = back;
        temp.prev = null;
        temp.next = null;
    }

    public static void main(String[] args) {

    }
}
