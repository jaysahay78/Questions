import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ListNode node3 = new ListNode(3,null);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode temp = node1;
        System.out.println(temp.next.next.val);
    }
}
