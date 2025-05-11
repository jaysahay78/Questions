import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycle {
    static Boolean isCycle(ListNode head) {
            if(head == null || head.next == null) return false;
            ListNode fast = head;
            ListNode slow = head;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    return true;
                }
            }
            return false;
    }
}
