public class SortList {
    static ListNode sortList(ListNode head) {
     if(head == null || head.next == null) return head;
    ListNode slow = head;
    ListNode fast = head.next;
    ListNode start = head;
        while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode mid = slow.next;
    slow.next = null;
    start = sortList(start);
    mid = sortList(mid);
    return Merge(start, mid);
}
    static ListNode Merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        return dummy.next;
    }
}
