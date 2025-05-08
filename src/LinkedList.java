public class LinkedList {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ListNode n1 = new ListNode(arr[0]);
        ListNode n2 = new ListNode(arr[1], n1);
        System.out.println(n2.next.val + " " + n2.val);
    }
}
