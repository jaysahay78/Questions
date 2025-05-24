public class PartitionList {
    static ListNode partition(ListNode head, int x) {
        ListNode low = new ListNode(0);
        ListNode ans = low;
        ListNode high = new ListNode(0);
        ListNode dum = high;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                low.next = new ListNode(temp.val);
                low = low.next;
            }
            else{
                high.next = new ListNode(temp.val);
                high = high.next;
            }
            temp = temp.next;
        }
        low.next = dum.next;
        return ans.next;
    }

    public static void main(String[] args) {

    }
}
