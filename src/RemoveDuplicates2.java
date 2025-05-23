public class RemoveDuplicates2 {
    static ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(0, head);
        ListNode temp = ans;
        while(temp.next != null && temp.next.next != null){
            if(temp.next.val == temp.next.next.val){
                int dup = temp.next.val;
                while(temp.next != null && temp.next.val == dup){
                    temp.next = temp.next.next;
                }
            }
            else {
                temp = temp.next;
            }
        }
        return ans.next;
    }

    public static void main(String[] args) {

    }
}
