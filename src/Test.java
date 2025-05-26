import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode curr = l;
        ListNode newNode = new ListNode(2, l);
        l = newNode;
        curr = curr.next;
        System.out.println(curr.val);
    }
}
