public class RandomListPointer {

    static Node copyRandomList(Node head){
        if (head == null) return null;
        Node temp = head;
        while(temp != null){
            Node nextNode = temp.next;
            Node copy = new Node(temp.val);
            temp.next = copy;
            copy.next = nextNode;
            temp = nextNode;
        }
        temp = head;
        while(temp != null && temp.next != null){
            Node copy = temp.next;
            if(temp.random == null) copy.random = null;
            else copy.random = temp.random.next;
            temp = temp.next.next;
        }

        temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;
        while(temp != null && temp.next != null){
            res.next = temp.next;
            res = res.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}
