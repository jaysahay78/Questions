import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    static int nodeNumber(ListNode head, int n) {
        ListNode temp = head;
        while(n+1!=0){
            temp = temp.next;
            n--;
        }
        return temp.val;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = ConvertToLL.convertArrtoLL(arr);
        System.out.println(nodeNumber(head,2));
    }
}
