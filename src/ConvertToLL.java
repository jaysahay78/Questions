public class ConvertToLL {
    public static ListNode convertArrtoLL(int[] arr) {
        int n = arr.length;
        ListNode head= new ListNode(arr[0]);
        ListNode mover=head;
        for (int i=1;i<arr.length;i++){
            ListNode temp= new ListNode(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;
    }
}
