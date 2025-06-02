public class ReverseKGroups {
    static ListNode reverseK(ListNode head, int k){
    ListNode temp = head;
    ListNode preNode = null;
        while(temp != null){
        ListNode kthNode = findK(temp, k);
        if(kthNode == null){
            if(preNode!=null) preNode.next = temp;
            break;
        }
        ListNode nextNode = kthNode.next;
        kthNode.next = null;
        ListNode newStart = reverse(temp);
        if(temp == head){
            head = newStart;
        }
        else {
            preNode.next = newStart;
        }
        preNode = temp;
        temp = nextNode;
    }
        return head;
}
static ListNode reverse(ListNode head){
    ListNode temp = head;
    ListNode prev = null;
    while(temp != null){
        ListNode newNode = temp.next;
        temp.next = prev;
        prev = temp;
        temp = newNode;
    }
    return prev;
}
static ListNode findK(ListNode temp, int k){
    k-=1;
    while(temp != null && k>0){
        k--;
        temp = temp.next;
    }
    return temp;
}

    public static void main(String[] args) {

    }
}
